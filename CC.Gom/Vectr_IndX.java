package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Math.Math_Plus;
import CC.Util.By.Get.Get_Dubl_By_Int;
import CC.Util.By.Set.Set_Dubl_By_Int;

import static CC.Encycloped.Abs.Scal.Gom.Gom.Dim;
import static CC.Math.Math_Plus.UnsIn;
import static java.lang.StrictMath.max;

public interface Vectr_IndX
{
//	default void Intrpolat(Vectr_IndX Out_Of,int Dim){Scal(Get_Dubl_By_Int(Dim)/Out_Of.Get_Dubl_By_Int(Dim));}

	//<editor-fold desc="Rad">
		default double Box()
		{
			double Mag=0;
//			for(int Dim=0;Dim<Valu_Num();Dim+=1){Mag=max(Mag,Unsin(Get_Dubl_By_Int(Dim)));}

			return Mag;
		}
		default double Tax()
		{
			double Mag=0;
//			for(int Dim=0;Dim<Valu_Num();Dim+=1){Mag+=Unsin(Get_Dubl_By_Int(Dim));}

			return Mag;
		}
	//</editor-fold>

	static void Bet(Get_Dubl_By_Int A,Get_Dubl_By_Int B,double Div,Set_Dubl_By_Int Ret){for(int IndX=0;IndX<A.Valu_Num();IndX+=1){Ret.Set_Dubl_By_Int(IndX,Math_Plus.Btw(A.Get_Dubl_By_Int(IndX),
			B.Get_Dubl_By_Int(IndX),Div));}}

	default void Ang(Vectr_IndX Ang)
	{
		double Mag=Tax();
//		for(int Dim=0;Dim<Valu_Num();Dim+=1){Ang.Set_Dubl_By_Int(Dim,Get_Dubl_By_Int(Dim)/Mag);}
	}
}