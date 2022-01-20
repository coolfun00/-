using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lec17
{
    class Matrix
    {
        protected double[][] m_ptr;
        protected int m_row;
        protected int m_col;
        protected int m_precision;
        protected void copy(Matrix m)
        {
            int i, j;

            m_row = m.m_row;
            m_col = m.m_col;
            m_precision = m.m_precision;
            m_ptr = new double[m_row][];
            for (i = 0; i < m_row; i++)
                m_ptr[i] = new double[m_col];

            for (i = 0; i < m_row; i++)
                for (j = 0; j < m_col; j++)
                    m_ptr[i][j] = m.m_ptr[i][j];
        }
        protected int getMaxDataWidth()
        {
            return 0;
        }
        public Matrix()
        {
            m_row = 0;
            m_col = 0;
            m_ptr = null;
            m_precision = 0; // 마치 정수형 인것처럼 출력
        }
        public Matrix(int row, int col)
        {
            m_row = row;
            m_col = col;
            m_precision = 0;
            m_ptr = new double[row][];
            for (int i = 0; i < row; i++)
                m_ptr[i] = new double[col];
        }
        public Matrix(Matrix m)
        {
            copy(m);
        }
        public int row()
        {
            return m_row;
        }
        public int column()
        {
            return m_col;
        }
        public void setPrecision(int x)
        {
            m_precision = x;
        }
        public double get(int i, int j)
        {
            return m_ptr[i][j];
        }
        public void set(int i, int j, double v)
        {
            m_ptr[i][j] = v;
        }
        public Matrix set(Matrix m)
        {
            copy(m);
            return this;
        }
        public Matrix add(Matrix m)
        {
            if (m_row != m.m_row || m_col != m.m_col)
            {
                Console.WriteLine("error occurs! - size mismatch");
                Environment.Exit(-1);
            }

            Matrix tmp = new Matrix(m_row, m_col);

            for (int i = 0; i < m_row; i++)
                for (int j = 0; j < m_col; j++)
                    tmp.m_ptr[i][j] = m_ptr[i][j] + m.m_ptr[i][j];

            return tmp;
        }
        public Matrix subtract(Matrix m)
        {
            Matrix tmp = new Matrix(m_row, m_col);
            return tmp;
        }
        public Matrix multiply(Matrix m)
        {
            if (m_col != m.m_row)
            {
                Console.WriteLine("error occurs! - size mismatch for multplication");
                Environment.Exit(-1);
            }

            Matrix tmp = new Matrix(m_row, m.m_col);

            for (int i = 0; i < m_row; i++)
                for (int j = 0; j < m.m_col; j++)
                {
                    double sum = 0;
                    for (int k = 0; k < m_col; k++)
                        sum = sum + m_ptr[i][k] * m.m_ptr[k][j];
                    tmp.m_ptr[i][j] = sum;
                }

            return tmp;
        }
        public Matrix multiply(double x)
        {
            Matrix tmp = new Matrix(m_row, m_col);

            for (int i = 0; i < m_row; i++)
                for (int j = 0; j < m_col; j++)
                    tmp.m_ptr[i][j] = m_ptr[i][j] * x;

            return tmp;
        }
        public void readDataFromConsole()
        {
            int row = m_row;
            int col = m_col;
            double[][] p = m_ptr;
            int i, j;

            for (i = 0; i < row; i++)
                for (j = 0; j < col; j++)
                {
                    double x;
                    Console.Write("data[" + i + "][" + j + "] = ");
                    x = Double.Parse(Console.ReadLine());
                    p[i][j] = x;
                }
        }
        public override String ToString()
        {
            String tmp = "    ";
            int row = m_row;
            int col = m_col;
            double[][] p = m_ptr;
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    tmp = tmp + p[i][j] + " ";
                }
                tmp = tmp + "\n";
            }
            return tmp;
        }
    }
    class StringArray
    {
        private String[] pArray;
        private int nArray;
        public StringArray()
        {
            nArray = 0;
            pArray = null;
        }
        public StringArray(int n)
        {
            nArray = n;
            pArray = new String[n];
        }
        public StringArray(StringArray sa)
        {
            nArray = sa.nArray;
            pArray = new String[nArray];
            for (int i = 0; i < nArray; i++)
            {
                pArray[i] = sa.pArray[i];
            }
        }
        public int size()
        {
            return nArray;
        }
        public String get(int i)
        {
            return pArray[i];
        }
        public void set(int i, String s)
        {
            pArray[i] = s;
        }
        public int getMaxStringLength()
        {
            int maxLength = 0;

            for (int i = 0; i < nArray; i++)
            {
                if (pArray[i].Length > maxLength)
                    maxLength = pArray[i].Length;
            }
            return maxLength;
        }
        public void readDataFromConsole()
        {
            String buffer;

            for (int i = 0; i < nArray; i++)
            {
                Console.Write((i + 1) + "번째 이름은: ");
                buffer = Console.ReadLine();
                pArray[i] = buffer;
            }
        }
        public override String ToString()
        {
            String tmp = "    ";
            for (int i = 0; i < nArray; i++)
            {
                tmp = tmp + pArray[i] + "\n";
            }
            return tmp;
        }
    }
    class MatrixWithNames : Matrix
    {
        private StringArray rowNames;
        private StringArray colNames;
        private String unitName;
        private String question;
        public MatrixWithNames()
            : base()
        {
            unitName = "";
            question = "";
            rowNames = null;
            colNames = null;
        }
        public MatrixWithNames(int row, int col)
            : base(row, col)
        {
            unitName = "";
            question = "";
            rowNames = null;
            colNames = null;
        }
        public MatrixWithNames(int row, int col, StringArray rNames, StringArray cNames, String uName, String q)
            : base(row, col)
        {
            unitName = uName;
            question = q;
            rowNames = new StringArray(rNames);
            colNames = new StringArray(cNames);
        }
        public MatrixWithNames(Matrix m, StringArray rNames, StringArray cNames, String uName, String q)
            : base(m)
        {
            unitName = uName;
            question = q;
            rowNames = new StringArray(rNames);
            colNames = new StringArray(cNames);
        }
        public void setRowNames(StringArray names)
        {
            rowNames = new StringArray(names);
        }
        public void setColumnNames(StringArray names)
        {
            colNames = new StringArray(names);
        }
        public void setUnitName(String name)
        {
            unitName = name;
        }
        public void setQuestion(String name)
        {
            question = name;
        }
        public void readDataFromConsole()
        {
            int row = m_row;
            int col = m_col;
            double[][] p = m_ptr;
            int i, j;

            for (i = 0; i < row; i++)
            {
                Console.WriteLine(rowNames.get(i) + "의");
                for (j = 0; j < col; j++)
                {
                    Console.Write("   " + colNames.get(j) + question + "? ");
                    p[i][j] = Double.Parse(Console.ReadLine());
                }
            }
        }
        public override String ToString()
        {
            //String tmp = "";
            int row = m_row;
            int col = m_col;
            double[][] p = m_ptr;

            String tmp = "    ";
            for (int i = 0; i < col; i++)
            {
                tmp = tmp + colNames.get(i) + " ";
            }
            tmp = tmp + "\n";

            for (int i = 0; i < row; i++)
            {
                tmp = tmp + rowNames.get(i) + " ";
                for (int j = 0; j < col; j++)
                {
                    tmp = tmp + p[i][j] + unitName + "  ";
                }
                tmp = tmp + "\n";
            }
            return tmp;
        }
    }
    class TestReusability
    {
        static void Main(string[] args)
        {
            int m;
            int nSushi;

            Console.WriteLine("초밥 먹으러 가자!!!");
            Console.Write("초밥 그릇 종류의 수는 ? ");
            nSushi = int.Parse(Console.ReadLine());

            StringArray dishNames = new StringArray(nSushi);

            Console.WriteLine("그릇 색깔 이름을 입력해주세요: (예 : 파랑색)");

            dishNames.readDataFromConsole();

            StringArray colNames = new StringArray(1);
            colNames.set(0, "   가격");
            MatrixWithNames dishUnits = new MatrixWithNames(nSushi, 1, dishNames, colNames, "원", "은 얼마인가");

            Console.WriteLine("각 초밥 그릇의 가격을 입력하세요:");

            dishUnits.readDataFromConsole();

            int nStudents;

            Console.Write("학생은 몇명입니까 ? ");
            nStudents = int.Parse(Console.ReadLine());

            StringArray studentNames = new StringArray(nStudents);

            Console.WriteLine("학생들의 이름을 입력하세요:");

            studentNames.readDataFromConsole();

            MatrixWithNames sushiData = new MatrixWithNames(nStudents, nSushi);
            sushiData.setRowNames(studentNames);
            sushiData.setColumnNames(dishNames);
            sushiData.setUnitName("개");
            sushiData.setQuestion(" 그릇의 초밥을 몇개 먹었습니까");

            Console.WriteLine("각 학생들이 먹은 초밥의 개수를 입력하세요:");

            sushiData.readDataFromConsole();

            Console.WriteLine("\n지금까지 입력한 데이터를 확인해 드리겠습니다.");

            Console.WriteLine("======== 회전 초밥 그릇별 가격 ========");
            Console.Write(dishUnits);
            Console.WriteLine("=======================================");

            Console.WriteLine("===== 각 학생들이 먹은 초밥의 개수 =====");
            Console.Write(sushiData);
            Console.WriteLine("=======================================");

            Matrix sushiTotalPerStudent = new Matrix();

            sushiTotalPerStudent = sushiData.multiply(dishUnits);

            StringArray summaryNames = new StringArray(1);
            summaryNames.set(0, " 총가격");
            MatrixWithNames sushiTotal = new MatrixWithNames(sushiTotalPerStudent, studentNames, summaryNames, "원", "얼마");

            Console.WriteLine("=== 각 학생들이 먹은 초밥의 총 가격 ===");

            Console.Write(sushiTotal);
            Console.WriteLine("=======================================");
        }
    }
}
