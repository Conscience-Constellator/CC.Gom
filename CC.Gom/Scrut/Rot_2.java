package CC.Encycloped.Abs.Scal.Gom.Scrut;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Math.Line;

public class Rot_2 extends Line
{
	public static final Clas_Rap Class=Init_StRt(Rot_2.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Rot_2(Line A,Line B)
	{
		this.A=A;
		this.B=B;
	}

	public Line A;
	public Line B;

	static{Init_Nd(Rot_2.class);}
}