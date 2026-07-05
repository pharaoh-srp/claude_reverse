package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r11 implements qud {
    public final int a;

    public r11(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return qud.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qud)) {
            return false;
        }
        qud qudVar = (qud) obj;
        return this.a == qudVar.tag() && mud.E.equals(qudVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (mud.E.hashCode() ^ 2041407134);
    }

    @Override // defpackage.qud
    public final mud intEncoding() {
        return mud.E;
    }

    @Override // defpackage.qud
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + mud.E + ')';
    }
}
