package CC.Encycloped.Abs.Scal.Gom;

import CC.Util.By.Get_Q_By_Q;

public class No<Vectr_Typ extends Get_Q_By_Q,In_Typ extends Inbl<Vectr_Typ>> extends Inbl_Havr.In_Havr_Imp<Vectr_Typ,In_Typ>
{
	public No(In_Typ Rapd){super(Rapd);}
	public No(){}

	@Override public boolean In(Vectr_Typ B){return !super.In(B);}
	@Override public boolean In(Bordr<Vectr_Typ> B){return !super.In(B);}
}