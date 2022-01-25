from PySide2.QtWidgets import QApplication,QWidget,QVBoxLayout,QHBoxLayout,QGridLayout,QStackedLayout,QPushButton
from PySide2.QtCore import Qt
from PySide2.QtGui import QColor,QPalette
import sys

class Color(QWidget):
    def __init__(self,color,parent=None):
        super().__init__(parent)

        self.setAutoFillBackground(True)

        palette = self.palette()
        palette.setColor(QPalette.Window, QColor(color))
        self.setPalette(palette)

class MyWidget(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle('Layout Class')
        self.resize(500,300)

        self.curIndex = 0

        vbLayout = QVBoxLayout()
        
      
        self.sLayout = QStackedLayout()
        self.sLayout.addWidget(Color('red'))
        self.sLayout.addWidget(Color('green'))
        self.sLayout.addWidget(Color('blue'))
        self.sLayout.addWidget(Color('yellow'))
        self.sLayout.setCurrentIndex(self.curIndex)

        button = QPushButton('Change Widget')
        button.clicked.connect(self.change_widget)

        vbLayout.addLayout(self.sLayout)
        vbLayout.addWidget(button)

        self.setLayout(vbLayout)

    def change_widget(self):
        self.curIndex = self.curIndex + 1
        self.curIndex = self.curIndex % 4
        self.sLayout.setCurrentIndex(self.curIndex)
        
        
if __name__ == '__main__':
    app = QApplication(sys.argv)
    mainWindow = MyWidget()
    mainWindow.show()
    app.exec_()
