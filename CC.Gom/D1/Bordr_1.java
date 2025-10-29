package CC.Encycloped.Abs.Scal.Gom.D1;

import CC.Encycloped.Abs.Scal.Gom.Inbl;
import CC.Math.Math_Plus;
import CC.Util.By.Get_Q_By_Q;

public interface Bordr_1<Vectr_Typ extends Get_Q_By_Q> extends Inbl<Vectr_Typ>
{
	int Min_Int(int Dim);
	long Min_Long(int Dim);
	float Min_Flot(int Dim);
	double Min_Dubl(int Dim);
	default int CNt_Int(int Dim){return (int)Math_Plus.CNtr(Min_Int(Dim),Max_Int(Dim));}
	default long CNt_Long(int Dim){return (long)Math_Plus.CNtr(Min_Int(Dim),Max_Int(Dim));}
	default float CNt_Flot(int Dim){return (float)Math_Plus.CNtr(Min_Int(Dim),Max_Int(Dim));}
	default double CNt_Dubl(int Dim){return Math_Plus.CNtr(Min_Int(Dim),Max_Int(Dim));}
	int Max_Int(int Dim);
	long Max_Long(int Dim);
	float Max_Flot(int Dim);
	double Max_Dubl(int Dim);
	default int LNg_Int(int Dim){return Max_Int(Dim)-Min_Int(Dim);}
	default long LNg_Long(int Dim){return Max_Long(Dim)-Min_Long(Dim);}
	default float LNg_Flot(int Dim){return Max_Flot(Dim)-Min_Flot(Dim);}
	default double LNg_Dubl(int Dim){return Max_Dubl(Dim)-Min_Dubl(Dim);}

	double Box_Rad_Dubl();
	double Box_Diam_Dubl();
	double Tax_Rad_Dubl();
	double Tax_Diam_Dubl();
	double Hyp_Rad_Dubl();
	double Hyp_Diam_Dubl();
}