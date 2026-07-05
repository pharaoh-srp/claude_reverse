package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gi implements hi {
    public final boolean a;
    public final boolean b;

    public gi(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.hi
    public final hi a() {
        return new gi(this.a, true);
    }

    @Override // defpackage.hi
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.hi
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        return this.a == giVar.a && this.b == giVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CheckboxAssurance(isAgeChecked=" + this.a + ", showPostSubmitAgeAssuranceErrors=" + this.b + ")";
    }
}
