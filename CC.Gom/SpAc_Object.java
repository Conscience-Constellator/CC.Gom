package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Util.By.Get_Q_By_Q;

public interface SpAc_Object<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Typ_Havr<Vectr_Typ>
{
	@Lin_Dclar
	void Ad_To_Spac(SpAc<Vectr_Typ> Spac);
}