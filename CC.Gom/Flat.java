package CC.Encycloped.Abs.Scal.Gom;

import CC.Util.By.Get.Get_Dubl_By_Int;
import CC.Util.By.Get_Q_By_Q;

public class Flat<Vectr_Typ extends Get_Q_By_Q> implements Bordr_LMNt<Vectr_Typ>
{
	public Flat(int Dim){this.Dim=Dim;}
	public Flat(){}

	public int Dim;
	@Override public boolean In(Vectr_Typ B){return ((Get_Dubl_By_Int)B).Get_Dubl_By_Int(Dim)<=0;}
}