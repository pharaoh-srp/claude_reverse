package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends wd6 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ c2 f;
    public final /* synthetic */ String g;
    public final Object h;

    public b2(c2 c2Var, String str) {
        this.f = c2Var;
        this.g = str;
        this.h = c2Var.b.b;
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public void A(long j) {
        switch (this.e) {
            case 1:
                I0(Long.toUnsignedString(j));
                break;
            default:
                super.A(j);
                break;
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public void F(String str) {
        switch (this.e) {
            case 0:
                str.getClass();
                this.f.N(this.g, new jh9(str, false, (SerialDescriptor) this.h));
                break;
            default:
                super.F(str);
                break;
        }
    }

    public void I0(String str) {
        str.getClass();
        this.f.N(this.g, new jh9(str, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final fof a() {
        switch (this.e) {
            case 0:
                return this.f.b.b;
            default:
                return (fof) this.h;
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public void g(short s) {
        switch (this.e) {
            case 1:
                I0(String.valueOf(s & 65535));
                break;
            default:
                super.g(s);
                break;
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public void i(byte b) {
        switch (this.e) {
            case 1:
                I0(String.valueOf(b & 255));
                break;
            default:
                super.i(b);
                break;
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public void w(int i) {
        switch (this.e) {
            case 1:
                I0(Integer.toUnsignedString(i));
                break;
            default:
                super.w(i);
                break;
        }
    }

    public b2(c2 c2Var, String str, SerialDescriptor serialDescriptor) {
        this.f = c2Var;
        this.g = str;
        this.h = serialDescriptor;
    }
}
