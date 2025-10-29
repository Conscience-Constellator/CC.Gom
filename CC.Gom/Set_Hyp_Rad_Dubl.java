package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;

import static java.lang.Double.parseDouble;

public interface Set_Hyp_Rad_Dubl
{
	Clas_Rap Class=Stat_Notif.Init_StRt(Set_Hyp_Rad_Dubl.class
		,Clas_Rap.class
	);/*Dep ?done*/

	void Set_Hyp_Rad(double Rad);
		default void Set_Hyp_Rad(String Rad){Set_Hyp_Rad(parseDouble(Rad));}
}
