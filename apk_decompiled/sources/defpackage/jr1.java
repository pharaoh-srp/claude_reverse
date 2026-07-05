package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr1 extends b5c {
    @Override // defpackage.b5c
    public final void f(b5c b5cVar) {
        if (b5cVar instanceof jr1) {
            this.a = b5cVar;
        } else {
            sz6.p("Parent of block must also be block (can not be inline)");
        }
    }
}
