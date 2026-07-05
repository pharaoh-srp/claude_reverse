package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ki2 implements hbd {
    public abstract boolean a(char c);

    @Override // defpackage.hbd
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
