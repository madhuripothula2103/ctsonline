package cts.pratise.seleniumprogram;

import cts.miniproject.utility.Exceldataconfig;

public class Readexceldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceldataconfig excel=new Exceldataconfig("D:\\\\ctsonline\\\\src\\\\test\\\\resources\\\\testdata\\\\testdata.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));

	}

}
