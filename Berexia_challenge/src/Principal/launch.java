package Principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class launch {

	public static void main(String[] args) throws Exception {
		
		LeGraph graphic=new LeGraph();
		graphic.main(null);
		
		// donnees vers la base de donnees
		System.out.println("launcher");
		DataToDataBase loadDataToDataBase=new DataToDataBase();
		DataToDataBase.readCsv("src/dataSet/input1.csv");
		loadDataToDataBase.readXLSXFile("src/dataSet/EA_result_1351.xlsx");
		
		
	}

}
