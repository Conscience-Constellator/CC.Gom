package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;
import CC.Util.Prim.Int_Havr_Abs;
import static java.lang.Integer.parseInt;

public interface Set_Hyp_Rad_Int
{
	Clas_Rap Class=Stat_Notif.Init_StRt(Set_Hyp_Rad_Int.class
		,Clas_Rap.class
	);/*Dep ?done*/

	void Set_Hyp_Rad(int Rad);
		default void Set_Hyp_Rad(Int_Havr_Abs Rad){Set_Hyp_Rad(Rad.$Int());}
		default void Set_Hyp_Rad(String Rad){Set_Hyp_Rad(parseInt(Rad));}

	interface Set_Hyp_Rad_Int_P extends Set_Hyp_Rad_Int
	{
		Clas_Rap Class=Stat_Notif.Init_StRt(Set_Hyp_Rad_Int_P.class
			,Clas_Rap.class
		);/*Dep ?done*/

		@Override default void Set_Hyp_Rad(int Rad){Set_Hyp_Rad(new Int_Havr_Abs.Int(Rad));}
	}
}