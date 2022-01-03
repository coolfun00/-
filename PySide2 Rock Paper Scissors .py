from PySide2.QtWidgets import QApplication, QWidget, QVBoxLayout, QHBoxLayout, QPushButton, QLabel
from PySide2.QtGui import QIcon
import sys
import random


class MyWidget(QWidget):
    def __init__(self):
        super().__init__()

        # 프로그램 타이틀
        self.setWindowTitle('RockPaperScissors Programming')
        
        # 프로그램 실행시 왼쪽 상단에 나오는 아이콘
        self.setWindowIcon(QIcon('pengsu.png'))
        
        # 프로그램 크기
        self.resize(500,300)
        
        # 레이아웃
        layout = QVBoxLayout()
        layout1 = QHBoxLayout()
        layout2 = QHBoxLayout()
        layout3 = QHBoxLayout()

        layout.addLayout(layout1)
        layout.addLayout(layout2)
        layout.addLayout(layout3)

        # 가위 바위 보 버튼
        self.button1 = QPushButton(self)
        layout3.addWidget(self.button1)
        self.button1.setStyleSheet('image:url(rock.jpg);')
        self.button1.setMinimumSize(200,200)
        self.button1.setMaximumSize(200,200)
 
        self.button2 = QPushButton(self)
        layout3.addWidget(self.button2)
        self.button2.setStyleSheet('image:url(scissors.jpg);')
        self.button2.setMinimumSize(200,200)
        self.button2.setMaximumSize(200,200)
      
        self.button3 = QPushButton(self)
        layout3.addWidget(self.button3)
        self.button3.setStyleSheet('image:url(paper.jpg);')
        self.button3.setMinimumSize(200,200)
        self.button3.setMaximumSize(200,200)

        # 컴퓨터인 펭수가 가위 바위 보를 하는 이미지
        self.label1 = QLabel(self)
        layout2.addWidget(self.label1)
        self.label1.setStyleSheet('image:url(pengsurock.jpg);')
        self.label1.setMinimumSize(200,200)
        
        self.label2 = QLabel(self)
        layout2.addWidget(self.label2)
        self.label2.setStyleSheet('image:url(pengsuscissors.png);')
        self.label2.setMinimumSize(200,200)

        self.label3 = QLabel(self)
        layout2.addWidget(self.label3)
        self.label3.setStyleSheet('image:url(pengsupaper.png);')
        self.label3.setMinimumSize(200,200)

        self.label4 = QLabel(self)
        layout2.addWidget(self.label4)
        self.label4.setStyleSheet('image:url(pengsu1.jpg);')
        self.label4.setMinimumSize(400,400)

        # 플레이어의 승 패 무 여부를 표시하는 이미지
        self.label5 = QLabel(self)
        layout1.addWidget(self.label5)
        self.label5.setStyleSheet('image:url(win.jpg);')
        self.label5.setMinimumSize(200,200)

        self.label6 = QLabel(self)
        layout1.addWidget(self.label6)
        self.label6.setStyleSheet('image:url(draw.jpg);')
        self.label6.setMinimumSize(200,200)

        self.label7 = QLabel(self)
        layout1.addWidget(self.label7)
        self.label7.setStyleSheet('image:url(lose.jpg);')
        self.label7.setMinimumSize(200,200)

        self.setLayout(layout)

        # 클릭 연결
        self.button1.clicked.connect(self.button1_clicked)
        self.button2.clicked.connect(self.button2_clicked)
        self.button3.clicked.connect(self.button3_clicked)

        # 겹치는 이미지 숨김
        self.label1.hide()
        self.label2.hide()
        self.label3.hide()
        self.label5.hide()
        self.label6.hide()
        self.label7.hide()

        
    # 가위 바위 보
    def button1_clicked(self):
        self.label4.hide()
        computer_choice = random.choice(('바위','가위','보'))
        print(computer_choice)
        if computer_choice == '바위':
            print('비겼다.')
            self.label1.show()
            self.label2.hide()
            self.label3.hide()
            self.label5.hide()
            self.label6.show()
            self.label7.hide()
        if computer_choice == '가위':
            print('이겼다!!')
            self.label1.hide()
            self.label2.show()
            self.label3.hide()
            self.label5.show()
            self.label6.hide()
            self.label7.hide()
        if computer_choice == '보':
            print('졌다ㅠㅠ')
            self.label1.hide()
            self.label2.hide()
            self.label3.show()
            self.label5.hide()
            self.label6.hide()
            self.label7.show()
            
    def button2_clicked(self):
        self.label4.hide()
        computer_choice = random.choice(('바위','가위','보'))
        print(computer_choice)
        if computer_choice == '바위':
            print('졌다ㅠㅠ')
            self.label1.show()
            self.label2.hide()
            self.label3.hide()
            self.label5.hide()
            self.label6.hide()
            self.label7.show()
        if computer_choice == '가위':
            print('비겼다.')
            self.label1.hide()
            self.label2.show()
            self.label3.hide()
            self.label5.hide()
            self.label6.show()
            self.label7.hide()
        if computer_choice == '보':
            print('이겼다!!')
            self.label1.hide()
            self.label2.hide()
            self.label3.show()
            self.label5.show()
            self.label6.hide()
            self.label7.hide()
            
    def button3_clicked(self):
        self.label4.hide()
        computer_choice = random.choice(('바위','가위','보'))
        print(computer_choice)
        if computer_choice == '바위':
            print('이겼다!!')
            self.label1.show()
            self.label2.hide()
            self.label3.hide()
            self.label5.show()
            self.label6.hide()
            self.label7.hide()
        if computer_choice == '가위':
            print('졌다ㅠㅠ')
            self.label1.hide()
            self.label2.show()
            self.label3.hide()
            self.label5.hide()
            self.label6.hide()
            self.label7.show()
        if computer_choice == '보':
            print('비겼다.')
            self.label1.hide()
            self.label2.hide()
            self.label3.show()
            self.label5.hide()
            self.label6.show()
            self.label7.hide()
   
app = QApplication([])

window = MyWidget()
window.show()

app.exec_()


