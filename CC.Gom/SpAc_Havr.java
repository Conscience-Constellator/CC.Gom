package CC.Encycloped.Abs.Scal.Gom;

public interface SpAc_Havr
{
		Spac Spac();
		void Set_Spac(Spac Spac);

	class SpAc_Havr_Imp implements SpAc_Havr
	{
		public SpAc_Havr_Imp(Spac Spac){Set_Spac(Spac);}
		public SpAc_Havr_Imp(){}

		public Spac Spac;
			@Override public Spac Spac(){return Spac;}
			@Override public void Set_Spac(Spac Spac)
			{
				if(this.Spac!=null){this.Spac().Objectg.remove(this);}
				this.Spac=Spac;
			}
	}
}