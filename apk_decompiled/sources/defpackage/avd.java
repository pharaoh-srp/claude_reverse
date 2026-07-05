package defpackage;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class avd implements vqi {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public mh7 d;
    public final uac e;

    public /* synthetic */ avd(uac uacVar, int i) {
        this.a = i;
        this.e = uacVar;
    }

    @Override // defpackage.vqi
    public final vqi b(String str) {
        int i = this.a;
        uac uacVar = this.e;
        switch (i) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((zud) uacVar).f(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((zrj) uacVar).b(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((esj) uacVar).b(this.d, str, this.c);
                return this;
        }
    }

    @Override // defpackage.vqi
    public final vqi c(boolean z) {
        int i = this.a;
        uac uacVar = this.e;
        switch (i) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((zud) uacVar).b(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((zrj) uacVar).c(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((esj) uacVar).c(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
