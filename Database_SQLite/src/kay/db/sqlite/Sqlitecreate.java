package kay.db.sqlite;

import android.content.Context;
import android.database.sqlite.*;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqlitecreate extends SQLiteOpenHelper{

	 static final int version = 1;
	 static final String dbname = "test";
	
	public Sqlitecreate(Context context) {
		super(context, dbname, null, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		String table = "CREATE TABLE table(SL# INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,NUMBER INTEGER)" ;
		db.execSQL(table);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
