package prob6;

public class Money {
	int mo;

	public Money(int mo) {
		this.mo = mo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Money other = (Money) obj;
		if (mo != other.mo)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mo;
		return result;

	}

	public int getMo() {
		return mo;
	}

	public void setMo(int mo) {
		this.mo = mo;
	}

	public Money add(Money money) {
		return new Money(mo + money.mo);
	}
	public Money minus(Money money) {
		return new Money(mo - money.mo);
	}
	public Money multiply(Money money) {
		return new Money(mo * money.mo);
	}
	public Money devide(Money money) {
		return new Money(mo / money.mo);
	}
}
