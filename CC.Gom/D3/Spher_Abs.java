package CC.Encycloped.Abs.Scal.Gom.D3;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Scal.Gom.Bordr;
import CC.Encycloped.Abs.Scal.Gom.Vectr;
import CC.Util.By.Get_Q_By_Q;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;
import static CC.Encycloped.Abs.Scal.Gom.D3.Gom_3_Dub.Rot;
import static java.lang.Math.max;

public interface Spher_Abs<Vectr_Typ extends Get_Q_By_Q> extends Bordr<Vectr_Typ>
{
	@Override default double Tax_Rad_Dubl()
	{
//		Rot(Hyp_Rad_Dub(),0,0,.5,.5,0);
		return Geom_3_Dub.Tax_Rad(null);
	}

	static double Ang_Max_Spher(double A,double B,double C,double Rad)
	{
		//if()
		//double p=Ang_To_Rot();

		return 0;
	}
	static double Ang_Max_Spher(double A,double B,double C,double Spher_A,double Spher_B,double Spher_C,double Rad){return Ang_Max_Spher(Spher_A-A,Spher_B-B,Spher_C-C,Rad);}

	class Sphere<Vectr_Typ extends Vectr>
	{
		public static double Ang_Max_Spher(double A,double B,double C,double Rad)
		{
			//if()
			//double p=Ang_To_Rot();

			return 0;
		}
		public static double Ang_Max_Spher(double A,double B,double C,double Sphere_A,double Sphere_B,double Sphere_C,double Rad){return Ang_Max_Spher(Sphere_A-A,Sphere_B-B,Sphere_C-C,Rad);}

//		public void XtNd_Spher(Bordr Extension){Set_Hyp_Rad(max(Extension.Prox_Max(Orig),Hyp_Rad_Dub()));}
	}
}