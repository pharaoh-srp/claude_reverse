package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uqj implements vrj {
    public final int a;

    public uqj(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return vrj.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrj)) {
            return false;
        }
        vrj vrjVar = (vrj) obj;
        return this.a == vrjVar.zza() && prj.E.equals(vrjVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (prj.E.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + prj.E + ')';
    }

    @Override // defpackage.vrj
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.vrj
    public final prj zzb() {
        return prj.E;
    }
}
