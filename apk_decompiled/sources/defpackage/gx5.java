package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class gx5 extends z6g implements ywg {
    public final dxg n;

    public gx5(dxg dxgVar) {
        super(new axg[2], new gg2[2]);
        int i = this.g;
        ro5[] ro5VarArr = this.e;
        fd9.M(i == ro5VarArr.length);
        for (ro5 ro5Var : ro5VarArr) {
            ro5Var.h(FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        this.n = dxgVar;
    }

    @Override // defpackage.ywg
    public final void c(long j) {
    }

    @Override // defpackage.z6g
    public final ro5 g() {
        return new axg(1);
    }

    @Override // defpackage.z6g
    public final so5 h() {
        return new gg2(this);
    }

    @Override // defpackage.z6g
    public final DecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.z6g
    public final DecoderException j(ro5 ro5Var, so5 so5Var, boolean z) {
        axg axgVar = (axg) ro5Var;
        gg2 gg2Var = (gg2) so5Var;
        try {
            ByteBuffer byteBuffer = axgVar.I;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            dxg dxgVar = this.n;
            if (z) {
                dxgVar.reset();
            }
            xwg xwgVarA = dxgVar.a(bArrArray, 0, iLimit);
            long j = axgVar.K;
            long j2 = axgVar.N;
            gg2Var.G = j;
            gg2Var.I = xwgVarA;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            gg2Var.J = j;
            gg2Var.H = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
