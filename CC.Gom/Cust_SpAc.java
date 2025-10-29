package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.CCPL.Fun.Object.Chek.Condition;
import CC.Math.Line;
import CC.Math.Slider;
import CC.List.Ara_List_Plus;
import CC.List.Hash_Map_Plus;

public abstract class Cust_SpAc extends Space
{
	public static final Clas_Rap Class=Init_StRt(Cust_SpAc.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Cust_SpAc(){}

	public Ara_List_Plus<Box> Box_List=new Ara_List_Plus<>();
	public Condition Border;

	public static Line[] Dimg=new Line[4];
	public static Line[] Rotor_List=new Line[3];

	public static Hash_Map_Plus<String,Line> Angle_List_Translation;

	static
	{
		Line Dimension_1=new Line();
		Dimg[0]=Dimension_1;
		Line Dimension_2=new Line();
		Dimg[1]=Dimension_2;
		Line Dimension_3=new Line();
		Dimg[2]=Dimension_3;
		Line Dimension_4=new Line();
		Dimg[3]=Dimension_4;
		Angle_List_Translation=new Hash_Map_Plus();
		Dimension_1=(Line)Dimg[0];
		Dimension_2=(Line)Dimg[1];
		Dimension_3=(Line)Dimg[2];
		Dimension_4=(Line)Dimg[3];
		Slider Dimension_1_0=new Slider(Dimension_1,0D);
		Slider Dimension_2_0=new Slider(Dimension_2,0D);
		Slider Dimension_3_0=new Slider(Dimension_3,0D);
		new Slider(Dimension_4,0D);
		/*Line Angle_1 = new Line(Dimension_1, Dimension_2, Array_List_Plus.New_Array_List_Plus_Vararg(new Object[]{Dimension_1_0, Dimension_2_0}), true);
		Angle_List.add(Angle_1);
		Angle_List_Translation.put("I", Angle_1);
		Line Angle_2 = new Line(Dimension_1, Dimension_3, new Array_List_Plus(new Slider[]{Dimension_1_0, Dimension_3_0}), true);
		Angle_List.add(Angle_2);
		Angle_List_Translation.put("K", Angle_2);
		Line Angle_3 = new Line(Dimension_2, Dimension_3, new Array_List_Plus(new Slider[]{Dimension_2_0, Dimension_3_0}), true);
		Angle_List.add(Angle_3);
		Angle_List_Translation.put("J", Angle_3);*/
	}

	//public static Custom_Space Test=new Custom_Space();

	static{
		Init_Nd(Cust_SpAc.class);}
}