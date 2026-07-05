package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl0 implements qg9 {
    public final /* synthetic */ int a;

    public /* synthetic */ gl0(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.a) {
        }
        return qg9.class;
    }

    @Override // defpackage.qg9
    public final /* synthetic */ String discriminator() {
        switch (this.a) {
        }
        return "type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 3:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 4:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 5:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 6:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 7:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 10:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 11:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 12:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            case 13:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof qg9) || !x44.r(discriminator(), ((qg9) obj).discriminator())) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        switch (this.a) {
        }
        return 705071198;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        switch (this.a) {
        }
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
    }
}
