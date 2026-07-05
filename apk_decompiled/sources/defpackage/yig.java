package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yig implements kl7 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ yig(int i, Object obj) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yig) {
            yig yigVar = (yig) obj;
            if (yigVar.a == this.a && yigVar.b == this.b && x44.r(yigVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kl7, defpackage.mb0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final w9h a(c9i c9iVar) {
        Object obj = this.c;
        return new w9h(this.a, this.b, obj == null ? null : (sb0) c9iVar.a().invoke(obj));
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + vb7.b(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public yig(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
