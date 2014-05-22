import java.awt.*;

import javax.swing.*;

import java.util.Scanner;

public class MyCanvas extends Canvas
	{
	static int rectangleSize;
	static String rectangleColor;
	static int boardSize;
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
		{
//		System.out.println("Please input the size of the chessboard you wish to draw (less than 900)");
//		Scanner userInput1 = new Scanner(System.in);
//		boardSize = userInput1.nextInt();
		// System.out.println("Please input the size of the rectangle you wish to draw (less than 1000)");
		// Scanner userInput1 = new Scanner(System.in);
		// rectangleSize = userInput1.nextInt();
		// System.out.println("Please input the color of the rectangle you wish to draw ('red' or 'blue')");
		// Scanner userInput2 = new Scanner(System.in);
		// rectangleColor = userInput2.nextLine();
		MyCanvas canvas = new MyCanvas();
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setResizable(false);
		frame.setVisible(true);
		}

	public void paint(Graphics graphics)
		{
		// if (rectangleColor.equals("red"))
		// {
		// graphics.setColor(Color.red);
		// }
		// else if (rectangleColor.equals("blue"))
		// {
		// graphics.setColor(Color.blue);
		// }
		// graphics.fillRect(10, 10, rectangleSize, rectangleSize);
		// graphics.setColor(Color.blue);
		graphics.drawRect(9, 9, boardSize - 9, boardSize - 9);
		for (int i = 0; i < 255; i++)
			{
			for (int j = 0; j < 255; j++)
				{
				for (int k = 0; k < 255; k++)
					{
					for (int l = 0; l < 8; l++)
						{
						for (int m = 0; m < 8; m++)
							{
							if ((l + m) % 2 == 0)
								{
								graphics.setColor(new Color(255 - i, 255 - j,
										255 - k));
								} else
								{
								graphics.setColor(new Color(i, j, k));
								}
							graphics.fillRect(10 + (m * (boardSize / 8)),
									10 + (l * (boardSize / 8)),
									(boardSize / 8), (boardSize / 8));
							}
						}
					}
				}
			}
		// for (int i = 0; i < 255; i++)
		// {
		// for (int j = 0; j < 255; j++)
		// {
		// for (int k = 0; k < 255; k++)
		// {
		// graphics.setColor(new Color(i, j, k));
		// graphics.fillRect(10, 10, 100, 100);
		// }
		// }
		// i = 0;
		// }
//		graphics.setColor(Color.white);
//		graphics.fillRect(0, 0, 1000, 1000);
//		for (int i = 0; i < 1001; i++)
//			{
//			try
//				{
//				Thread.sleep(10);
//				} catch (InterruptedException e)
//				{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				}
//			graphics.setColor(Color.black);
//			graphics.fillRect(i, 10, 20, 20);
//			graphics.setColor(Color.white);
//			graphics.fillRect(i - 20, 10, 20, 20);
//			if (i == 1000)
//				{
//				i = 0;
//				}
//			}
//		graphics.setColor(Color.white);
//		graphics.fillRect(0, 0, 1000, 1000);
//		for (int i = 0; i < 1001; i++)
//			{
//			try
//				{
//				Thread.sleep(10);
//				} catch (InterruptedException e)
//				{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				}
//			graphics.setColor(Color.black);
//			graphics.fillRect(i, i, 20, 20);
//			graphics.setColor(Color.white);
//			graphics.fillRect(i, i - 19, 20, 20);
//			graphics.fillRect(i - 19, i, 20, 20);
//			if (i == 1000)
//				{
//				i = 0;
//				}
//			}
		}
	}