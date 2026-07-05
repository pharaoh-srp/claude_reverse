package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qqj implements orj {
    public final int a;

    public qqj(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return orj.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orj)) {
            return false;
        }
        orj orjVar = (orj) obj;
        return this.a == orjVar.zza() && irj.E.equals(orjVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (irj.E.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + irj.E + ')';
    }

    @Override // defpackage.orj
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.orj
    public final irj zzb() {
        return irj.E;
    }
}
