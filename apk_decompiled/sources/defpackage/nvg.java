package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nvg extends n2g implements ylg {
    @Override // defpackage.ylg
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.L;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.M + ((long) ((int) ((r() + ((long) this.O)) - this.M)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            Object[] objArr = this.L;
            objArr.getClass();
            f(Integer.valueOf(((Number) objArr[((int) ((this.M + ((long) ((int) ((r() + ((long) this.O)) - this.M)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
