import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DrawPolyPanel extends JPanel
{	DrawPolyPanel()
	   {
			setBackground(Color.black);
	   }
	public void paintComponent(Graphics g)
    { super.paintComponent(g);

	  
   	  //¿ÞÂÊ »Ô
      int x1Array[] = {120,150,200,265,265,220,190,121};
	  int y1Array[] = {130,227,300,294,256,223,133,130};

	  g.drawPolyline(x1Array, y1Array, 8);
	  g.setColor(Color.gray);
	  g.fillPolygon(x1Array, y1Array, 8);
	  
	  //¿À¸¥ÂÊ »Ô
	  int x2Array[] = {480,450,394,335,335,380,410,480};
	  int y2Array[] = {130,227,300,294,256,223,133,130};
	  
	  g.drawPolyline(x2Array, y2Array, 8);
	  g.setColor(Color.gray);
	  g.fillPolygon(x2Array, y2Array, 8);

	  //¿ÞÂÊ ±Í
	  int x3Array[] = {200,65,205,200};
	  int y3Array[] = {300,314,331,300};

	  g.drawPolyline(x3Array, y3Array, 4);
	  g.setColor(Color.yellow);
	  g.fillPolygon(x3Array, y3Array, 4);
	  
	  //¿À¸¥ÂÊ ±Í
	  int x4Array[] = {394,536,393,394};
	  int y4Array[] = {300,314,331,300};

	  g.drawPolyline(x4Array, y4Array, 4);
	  g.setColor(Color.yellow);
	  g.fillPolygon(x4Array, y4Array, 4);

	  //¿ÞÂÊ ´«
	  int x5Array[] = {261,283,250,223,261};
	  int y5Array[] = {301,319,327,301,301};

	  g.drawPolyline(x5Array, y5Array, 5);
	  g.setColor(Color.yellow);
	  g.fillPolygon(x5Array, y5Array, 5);

	  //¿À¸¥ÂÊ ´«
	  int x6Array[] = {338,375,348,317,338};
	  int y6Array[] = {301,302,326,319,301};
	 
	  g.drawPolyline(x6Array, y6Array, 5);
	  g.setColor(Color.yellow);
	  g.fillPolygon(x6Array, y6Array, 5);
	  
	  //¿ÞÂÊ º¼
	  int x7Array[] = {200,220,250,255,208,200};
	  int y7Array[] = {300,300,330,375,331,300};

	  g.setColor(new Color(20,52,180));
	  g.drawPolyline(x7Array, y7Array, 6);
	  g.fillPolygon(x7Array, y7Array, 6);
	  
	  //¿À¸¥ÂÊ º¼
	  int x8Array[] = {394,380,347,343,393,394};
	  int y8Array[] = {300,300,330,375,331,300};

	  g.drawPolyline(x8Array, y8Array, 6);
	  g.setColor(new Color(20,52,180));
	  g.fillPolygon(x8Array, y8Array, 6);
	  
	  //¿ÞÂÊ ¾ÈÂÊ º¼
	  int x9Array[] = {250,286,280,255,250};
	  int y9Array[] = {330,324,377,375,330};

	  g.drawPolyline(x9Array, y9Array, 5);
	  g.setColor(new Color(25,110,174));
	  g.fillPolygon(x9Array, y9Array, 5);

	  //¿ÞÁ· ÄÚ À½¿µÃ³¸®
	  int x10Array[] = {286,292,280,286};
	  int y10Array[] = {324,371,377,324};

	  g.drawPolyline(x10Array, y10Array, 4);
	  g.setColor(new Color(32,50,122));
	  g.fillPolygon(x10Array, y10Array, 4);

	  //ÄÚ
	  int x11Array[] = {286,312,305,293,286};
	  int y11Array[] = {324,324,368,368,324};

	  g.drawPolyline(x11Array, y11Array, 5);
	  g.setColor(new Color(25,110,174));
	  g.fillPolygon(x11Array, y11Array, 5);

	  //¿À¸¥ÂÊ ÄÚ À½¿µÃ³¸®
	  int x12Array[] = {312,318,305,312};
	  int y12Array[] = {324,377,371,324};

	  g.drawPolyline(x12Array, y12Array, 4);
	  g.setColor(new Color(32,50,122));
	  g.fillPolygon(x12Array, y12Array, 4);

	  //¿À¸¥ÂÊ ¾ÈÂÊ º¼
	  int x13Array[] = {312,347,341,318,312};
	  int y13Array[] = {324,330,375,377,324};

	  g.drawPolyline(x13Array, y13Array, 5);
	  g.setColor(new Color(25,110,174));
	  g.fillPolygon(x13Array, y13Array, 5);

	  //¿ÞÂÊ ÅÎ
	  int x14Array[] = {205,255,255,207,205};
	  int y14Array[] = {331,375,445,363,331};
	  
	  g.drawPolyline(x14Array, y14Array, 5);
	  g.setColor(new Color(156,156,156));
	  g.fillPolygon(x14Array, y14Array, 5);

	  //Áß¾Ó ÅÎ
	  int x15Array[] = {255,343,340,255,255};
	  int y15Array[] = {375,375,445,445,375};

	  g.drawPolyline(x15Array, y15Array, 5);
	  g.setColor(Color.gray);
	  g.fillPolygon(x15Array, y15Array, 5);

	  //¿À¸¥ÂÊ ÅÎ
	  int x16Array[] = {393,343,340,393,393};
	  int y16Array[] = {331,375,445,363,331};

	  g.drawPolyline(x16Array, y16Array, 5);
	  g.setColor(new Color(156,156,156));
	  g.fillPolygon(x16Array, y16Array, 5);

	  //Áß¾Ó ÅÎ ¿ÞÂÊ 1¹ø ÀÚ¸®
	  int x17Array[] = {293,293,305,305,293};
	  int y17Array[] = {392,434,434,392,392};

	  g.drawPolyline(x17Array, y17Array, 5);
	  g.setColor(Color.black);
	  g.fillPolygon(x17Array, y17Array, 5);

	  //Áß¾Ó ÅÎ ¿ÞÂÊ 2¹ø ÀÚ¸®
	  int x18Array[] = {260,260,272,272,260};
	  int y18Array[] = {392,434,434,392,392};

	  g.drawPolyline(x18Array, y18Array, 5);
	  g.setColor(Color.black);
	  g.fillPolygon(x18Array, y18Array, 5);

	  //Áß¾Ó ÅÎ ¿ÞÂÊ 3¹ø ÀÚ¸®
	  int x19Array[] = {326,326,338,338,326};
	  int y19Array[] = {392,434,434,392,392};

	  g.drawPolyline(x19Array, y19Array, 5);
	  g.setColor(Color.black);
	  g.fillPolygon(x19Array, y19Array, 5);

	  //ÀÌ¸¶
	  int x20Array[] = {283,317,335,335,265,265,283};
	  int y20Array[] = {319,319,294,256,256,294,319};

	  g.drawPolyline(x20Array, y20Array, 7);
	  g.setColor(Color.red);
	  g.fillPolygon(x20Array, y20Array, 7);

	  //ÀÌ¸¶ À§ ¿ø
	  int r = 35; // radius of circle bounding PacMan(R)
      int cx = 300; // center of that circle
      int cy = 256;
      int angle = 90; // opening angle of mouth
	  int start = 0;
      
      int dx = (int)(r * Math.cos(angle * Math.PI / 2));
      int dy = (int)(r * Math.sin(angle * Math.PI / 2));
      
      g.drawLine(cx, cy, cx + dx, cy + dy); // lower jaw
      g.drawLine(cx, cy, cx + dx, cy - dy); // upper jaw
	  g.setColor(Color.blue);
	  g.fillArc(cx - r, cy - r, 2 * r, 2 * r, start, 
         360 - 2 * angle); 

	  //ÀÌ¸¶ À§ »Ô
	  int x21Array[] = {280,300,320};
	  int y21Array[] = {221,150,221};

	  g.drawPolyline(x21Array, y21Array, 3);
	  g.setColor(Color.red);
	  g.fillPolygon(x21Array, y21Array, 3);

	  //ÀÌ¸¶ À§ »Ô ¿ÞÂÊ °ø°£
	  int x22Array[] = {280,280,300,280};
	  int y22Array[] = {221,227,221,221};

	  g.drawPolyline(x22Array, y22Array, 4);
	  g.setColor(Color.red);
	  g.fillPolygon(x22Array, y22Array, 4);

	  //ÀÌ¸¶ À§ »Ô ¿À¸¥ÂÊ °ø°£
	  int x23Array[] = {320,320,300,320};
	  int y23Array[] = {221,227,221,221};

	  g.drawPolyline(x23Array, y23Array, 4);
	  g.setColor(Color.red);
	  g.fillPolygon(x23Array, y23Array, 4);

	  //¿ÞÂÊ ÅÎ ¿ÞÂÊ 1¹ø ÀÚ¸®
	  int x24Array[] = {216,216,222,222,216};
	  int y24Array[] = {349,372,372,349,349};
	  
	  g.setColor(Color.black);
	  g.drawPolyline(x24Array, y24Array, 5);
	  g.fillPolygon(x24Array, y24Array, 5);

	  //¿ÞÂÊ ÅÎ ¿ÞÂÊ 2¹ø ÀÚ¸®
	  int x25Array[] = {232,232,238,238,232};
	  int y25Array[] = {372,395,395,372,372};

	  g.drawPolyline(x25Array, y25Array, 5);
	  g.setColor(Color.black);
	  g.fillPolygon(x25Array, y25Array, 5);

	  //¿À¸¥ÂÊ ÅÎ ¿À¸¥ÂÊ 1¹ø ÀÚ¸®
	  int x26Array[] = {377,377,383,383,377};
	  int y26Array[] = {349,372,372,349,349};

	  g.drawPolyline(x26Array, y26Array, 5);
	  g.setColor(Color.black);
	  g.fillPolygon(x26Array, y26Array, 5);

	  //¿À¸¥ÂÊ ÅÎ ¿À¸¥ÂÊ 2¹ø ÀÚ¸®
	  int x27Array[] = {361,361,367,367,361};
	  int y27Array[] = {372,395,395,372,372};

	  g.drawPolyline(x27Array, y27Array, 5);
	  g.setColor(Color.black);
	  g.fillPolygon(x27Array, y27Array, 5);

	  //¿ÞÂÊ ¾ÈÂÊ »Ô
      int x28Array[] = {196,220,237,271,230,196};
	  int y28Array[] = {147,223,238,238,147,147};

	  g.drawPolyline(x28Array, y28Array, 6);
	  g.setColor(new Color(60,60,60));
	  g.fillPolygon(x28Array, y28Array, 6);

	  //¿À¸¥ÂÊ ¾ÈÂÊ »Ô
      int x29Array[] = {405,380,363,329,369,403};
	  int y29Array[] = {147,223,238,238,147,147};

	  g.drawPolyline(x29Array, y29Array, 6);
	  g.setColor(new Color(60,60,60));
	  g.fillPolygon(x29Array, y29Array, 6);

	  //º° ±×¸®±â
	  //int x30Array[] = {300,265,150,240,210,310,410,370,460,345,300};
	  //int y30Array[] = {30,130,130,195,310,240,310,195,130,130,30};

	  int x30Array[] = {300,285,244,274,265,300,333,323,353,313,300};
	  int y30Array[] = {27,64,67,91,129,108,129,91,67,64,27};

	  g.drawPolyline(x30Array, y30Array, 11);
	  //g.setColor(new Color(225,250,153));
	  g.setColor(new Color(225,250,153));
	  g.fillPolygon(x30Array, y30Array, 11);

	  //¿ÞÂÊ º°±×¸®±â
	  int x31Array[] = {73,64,41,57,53,73,93,88,104,82,73};
	  int y31Array[] = {204,227,230,246,272,260,272,246,230,227,204};

	  g.drawPolyline(x31Array, y31Array, 11);
	 g.setColor(new Color(225,250,153));
	  g.fillPolygon(x31Array, y31Array, 11);

	  //¿À¸¥ÂÊ º°±×¸®±â
	  int x32Array[] = {538,529,506,522,518,538,558,553,569,547,538};
	  int y32Array[] = {204,227,230,246,272,260,272,246,230,227,204};

	  g.drawPolyline(x32Array, y32Array, 11);
	  g.setColor(new Color(225,250,153));
	  g.fillPolygon(x32Array, y32Array, 11);

   }
}



class ProgramFrame extends JFrame
{
	public ProgramFrame()
	{
		setTitle("MazingerZ");
		setSize(600, 600);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		} );

		Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("icon.jpeg");
        setIconImage(img);

		Container contentPane = getContentPane();
		contentPane.add(new DrawPolyPanel());
	}
}

public class MazingerZ
{  public static void main(String[] args)
   {  
	   JFrame frame = new ProgramFrame();
	   frame.show();
   }
}
