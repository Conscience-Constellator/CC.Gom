package CC.Encycloped.Abs.Scal.Gom;

import CC.Util.By.Get.Get_Dubl_By_Int;
import CC.Util.By.Get_Q_By_Q;

public class Ang_<Vectr_Typ extends Get_Q_By_Q> extends Rad_Havr<Vectr_Typ>
{
	public Ang_(double Rad){super(Rad);}
	public Ang_(){}

	@Override public boolean In(Vectr_Typ B){return Ang_Prox((Get_Dubl_By_Int)B)<Rad;}
	static double Ang_Prox(Get_Dubl_By_Int B){return B.Get_Dubl_By_Int(0)+1;}
}