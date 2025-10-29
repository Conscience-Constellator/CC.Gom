package CC.Encycloped.Abs.Scal.Gom.D3;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Scal.Gom.Gom_Inf_Untyp;
import CC.Encycloped.Abs.Scal.Gom.Gom;
import CC.Math.Line;
import CC.Math.Math_Plus;
import CC.Util.By.Pref_Set.Pref_Set_Dubl_By_Int;
import CC.Util.By.Set.Set_Dubl_By_Int;
import CC.Util.IndX.Dubl_By_IndX_Ara;
import java.lang.reflect.Method;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap.Try_Get_Meth;
import static CC.Math.Math_Plus.ScAl;
import static CC.Math.Math_Plus.UnsIn;
import static CC.Util.Prim.Transprimitive.Dub_;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class Gom_3_Dub implements CC.Encycloped.Abs.Scal.Gom.D2.Gom
{
	public static final Clas_Rap Class=Init_StRt(CC.Encycloped.Abs.Scal.Gom.D3.Gom_3_Dub.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public static Line Y=Gom.Dim(0),Z=Gom.Dim(1),X=Gom.Dim(2);

	public static double Hyp_Rad(Set_Dubl_By_Int Vectr)
	{
		double A=Vectr.Get_Dubl_By_Int(0),B=Vectr.Get_Dubl_By_Int(1),C=Vectr.Get_Dubl_By_Int(2);
		double Mag=sqrt((A*A)+(B*B)+(C*C));
		out.println("A="+A+",B="+B+",C="+C+",Mag="+Mag);

		return Mag;
	}
	public static double Tax_Rad(Set_Dubl_By_Int Vectr)
	{
		double A=Vectr.Get_Dubl_By_Int(0),B=Vectr.Get_Dubl_By_Int(1),C=Vectr.Get_Dubl_By_Int(2);
		return ((A<0)?-A:A)+((B<0)?-B:B)+((C<0)?-C:C);
	}

	public static boolean In_Hyp(Set_Dubl_By_Int Vectr,double Prox){return Hyp_Rad(Vectr)<=Prox;}

	public static double Ang_Tax(Set_Dubl_By_Int Vectr)
	{
		double A=Vectr.Get_Dubl_By_Int(0),B=Vectr.Get_Dubl_By_Int(1),C=Vectr.Get_Dubl_By_Int(2),Mag=Tax_Rad(Vectr);
		A=Math_Plus.ScAl(Mag,A,1);
		B=Math_Plus.ScAl(Mag,B,1);
		C=Math_Plus.ScAl(Mag,C,1);

		return Tax_Rad(Vectr);
	}
	public static void Ang_Hyp(Set_Dubl_By_Int From,Set_Dubl_By_Int Ang)
	{
		double A=From.Get_Dubl_By_Int(0),B=From.Get_Dubl_By_Int(1),C=From.Get_Dubl_By_Int(2),Mag=Hyp_Rad(From);
		Ang.Int_Dubl$(0,Math_Plus.ScAl(Mag,A,1));
		Ang.Int_Dubl$(1,Math_Plus.ScAl(Mag,B,1));
		Ang.Int_Dubl$(2,Math_Plus.ScAl(Mag,C,1));
	}

	public static void Mag_And_Ang_To_Cord(double Mag,
										   Set_Dubl_By_Int Angl,
										   Set_Dubl_By_Int Cord)
	{
		double A=Angl.Get_Dubl_By_Int(0),B=Angl.Get_Dubl_By_Int(1),C=Angl.Get_Dubl_By_Int(2);
		//Ang_Sum,Floor
		double Mag_Sqar=Mag*Mag,A_Sqar=A*A,B_Sqar=B*B,C_Sqar=C*C,Ang_Mag=A_Sqar+B_Sqar+C_Sqar;
		Cord.Int_Dubl$(0,sqrt(Math_Plus.ScAl(Ang_Mag,(A<0)?-A_Sqar:A_Sqar,Mag_Sqar)));
		Cord.Int_Dubl$(1,sqrt(Math_Plus.ScAl(Ang_Mag,(B<0)?-B_Sqar:B_Sqar,Mag_Sqar)));
		Cord.Int_Dubl$(2,sqrt(Math_Plus.ScAl(Ang_Mag,(C<0)?-C_Sqar:C_Sqar,Mag_Sqar)));
		/*if(A<B)
		{
			if(A<C)
			{
				Floor=1/A;
				B*=Floor;
				C*=Floor;
				Ang_Sum=1+B+C;
				Out[0]=Scale(Ang_Sum,1,Mag);
				Out[1]=Scale(Ang_Sum,B,Mag);
				Out[2]=Scale(Ang_Sum,C,Mag);
			}
			else
			{
				Floor=1/C;
				A*=Floor;
				B*=Floor;
				Ang_Sum=A+B+1;
				Out[0]=Scale(Ang_Sum,A,Mag);
				Out[1]=Scale(Ang_Sum,B,Mag);
				Out[2]=Scale(Ang_Sum,1,Mag);
			}
		}
		else
		{
			if(B<C)
			{
				Floor=1/B;
				A*=Floor;
				C*=Floor;
				Ang_Sum=A+1+C;
				Out[0]=Scale(Ang_Sum,A,Mag);
				Out[1]=Scale(Ang_Sum,1,Mag);
				Out[2]=Scale(Ang_Sum,C,Mag);
			}
			else
			{
				Floor=1/C;
				A*=Floor;
				B*=Floor;
				Ang_Sum=A+B+1;
				Out[0]=Scale(Ang_Sum,A,Mag);
				Out[1]=Scale(Ang_Sum,B,Mag);
				Out[2]=Scale(Ang_Sum,1,Mag);
			}
		}*/
	}
	public static void Trn(double A,double B,double C,double AB,double AC,double BC,Set_Dubl_By_Int Ang)
	{
		out.println(A+","+B+","+C+","+AB+","+AC+","+BC+","+Ang);
		Set_Dubl_By_Int Ang_2D=new Dubl_By_IndX_Ara(0,0);
		double Por=1/(1-Unsin(Ang.Get_Dubl_By_Int(2)));
		out.println("Por"+Por);
		if(Por!=0)
		{
//			Geom_2_Dub.Turn(A*Por,B*Por,AB,Ang_2D);
			Ang.Set_Dubl_By_Int(0,Ang_2D.Get_Dubl_By_Int(0)/Por);
			Ang.Set_Dubl_By_Int(1,Ang_2D.Get_Dubl_By_Int(1)/Por);
		}
		Por=1/(1-Unsin(Ang.Get_Dubl_By_Int(1)));
		out.println(Ang);
		out.println("Por"+Por);
		if(Por!=0)
		{
//			Geom_2_Dub.Turn(A*Por,C*Por,AC,Ang_2D);
			Ang.Set_Dubl_By_Int(0,Ang_2D.Get_Dubl_By_Int(0)/Por);
			Ang.Set_Dubl_By_Int(2,Ang_2D.Get_Dubl_By_Int(1)/Por);
		}
		Por=1/(1-Unsin(Ang.Get_Dubl_By_Int(0)));
		out.println(Ang);
		out.println("Por"+Por);
		if(Por!=0)
		{
//			Geom_2_Dub.Turn(B*Por,C*Por,BC,Ang_2D);
			Ang.Set_Dubl_By_Int(1,Ang_2D.Get_Dubl_By_Int(0)/Por);
			Ang.Set_Dubl_By_Int(2,Ang_2D.Get_Dubl_By_Int(1)/Por);
		}
		out.println(Ang);
	}
		public static void Trn(Set_Dubl_By_Int From,
							   double AB,
							   double AC,
							   double BC,
							   Set_Dubl_By_Int To)
		{
			Trn(
				From.Get_Dubl_By_Int(0),
				From.Get_Dubl_By_Int(1),
				From.Get_Dubl_By_Int(2),
				AB,AC,BC,To);
		}
	public static void Rot(Set_Dubl_By_Int Vectr,
						   double AB,
						   double AC,
						   double BC,Set_Dubl_By_Int Ang)
	{
		Ang_Hyp(Vectr,Ang);
		Mag_And_Ang_To_Cord(Hyp_Rad(Vectr),Ang,Ang);
	}

	public static double Cord(
			double Ang_Y,
			double Ang_Z,
			double Ang_X,
			double Y,double Z,double X){return 0;}

	public static void Prox_To_Ang(double Vectr,double[] Cordg){}

	public static Gom_Inf_Untyp Geom_Inf=new Gom_Inf_Untyp(3,Dub_);

	public static CC.Encycloped.Abs.Scal.Gom.D3.Gom_3_Dub Geometry=new CC.Encycloped.Abs.Scal.Gom.D3.Gom_3_Dub();

	public static Method Turn=Try_Get_Meth(CC.Encycloped.Abs.Scal.Gom.D3.Gom_3_Dub.class,"Turn",
			double.class,double.class,double.class,
			double.class,double.class,double.class,Pref_Set_Dubl_By_Int.class),Rot;
	public static Nom_Imp_Par Minang=new Nom_Imp_Par();
	@Override public Method Turn(){return Turn;}
	@Override public Method Rot(){return Rot;}

	@Override public Nom_Imp_Par Ang_Bord(){return null;}

	static{Init_Nd(CC.Encycloped.Abs.Scal.Gom.D3.Gom_3_Dub.class);}
}