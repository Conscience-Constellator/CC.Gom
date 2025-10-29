package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Scal.Gom.Vectr_Havr_2.Vectr_Setbl_2.Vectr_Setbl_2_Imp;
import CC.Util.By.Get.Get_Int_By_Int;
import CC.Util.By.Get_Q_By_Q;
import static java.lang.StrictMath.min;

public class Lin<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Setbl_2_Imp<Vectr_Typ>implements Bordr<Vectr_Typ>
{
	@Override public int Dim_Num(){return Vectr_A.Valu_Num();}

	@Override public int Min_Int(int Dim){return min(((Get_Int_By_Int)Vectr_A).Get_Int_By_Int(Dim),((Get_Int_By_Int)Vectr_B).Get_Int_By_Int(Dim));}
	@Override public long Min_Long(int Dim){return 0;}
	@Override public float Min_Flot(int Dim){return 0;}
	@Override public double Min_Dubl(int Dim){return 0;}
	@Override public int CNt_Int(int Dim){return 0;}
	@Override public long CNt_Long(int Dim){return 0;}
	@Override public float CNt_Flot(int Dim){return 0;}
	@Override public double CNt_Dubl(int Dim){return 0;}
	@Override public int Max_Int(int Dim){return 0;}
	@Override public long Max_Long(int Dim){return 0;}
	@Override public float Max_Flot(int Dim){return 0;}
	@Override public double Max_Dubl(int Dim){return 0;}
	@Override public long LNg_Long(int Dim){return 0;}
	@Override public float LNg_Flot(int Dim){return 0;}
	@Override public double Tax_Rad_Dubl(){return 0;}
	@Override public double Hyp_Rad_Dubl(){return 0;}
	@Override public boolean In(Vectr_Typ B){return false;}
	@Override public boolean In(Bordr<Vectr_Typ> B){return false;}
}