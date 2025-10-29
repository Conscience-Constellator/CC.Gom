package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
	import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt;
import static java.lang.Long.parseLong;

public interface Set_Hyp_Rad_Long
{
	Clas_Rap Class=Init_StRt(Set_Hyp_Rad_Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	void Set_Hyp_Rad(long Rad);
		default void Set_Hyp_Rad(String Rad){Set_Hyp_Rad(parseLong(Rad));}
}
