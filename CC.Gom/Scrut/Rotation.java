package CC.Encycloped.Abs.Scal.Gom.Scrut;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Math.Math_Plus;
import CC.Util.By.Pref_Set.Pref_Set_Dubl_By_Int;
import static CC.Math.Math_Plus.ScAl;

public class Rotation
{
	public static final Clas_Rap Class=Init_StRt(Rotation.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Rotation(double AB,double AC,double BC)
	{Set_Rot(AB,AC,BC);}
	public Rotation(){}

	public double AB,AC,BC;
		public void Set_Rot(double AB,double AC,double BC)
		{
			this.AB=AB;
			this.BC=BC;
			this.AC=AC;
		}

	public void Transform(double Y,double Z,double X,Pref_Set_Dubl_By_Int Vectr)
	{
		double Mag_Hyp=Math.sqrt((Y*Y)+(Z*Z)),Factr,A_Sqar_Rat,B_Square_Rat,p,B_Sqar,C_Square,B;
		if(Y>0)
		{
			if(Z>0){}
			if(Z<0)
			{
				if(Y<Z)
				{
					Factr=1/Y;
					B=Z*Factr;
					B_Sqar=B*B;
					p=1+B;
					Y=Math_Plus.ScAl(p,1,Mag_Hyp);
					Z=Math_Plus.ScAl(p,B,Mag_Hyp);
				}
				else
				{
					Factr=1/Z;
					B=Y*Factr;
					B_Sqar=B*B;
					p=1+B;
					Z=Math_Plus.ScAl(p,1,Mag_Hyp);
					Y=Math_Plus.ScAl(p,B,Mag_Hyp);
				}
			}
			else{if(Y<Z);}
		}
		else if(Y<0)
		{
			if(Z<0){if(Y<Z);}
			else{if(Y<Z);}
		}
		else{}
	}
	public void Transform(double Y,double Z,double X,double[] Vectr)
	{
		;
	}
	public double[] Transform(double Y,double Z,double X)
	{
		return new double[0];
	}

	static{Init_Nd(Rotation.class);}
}