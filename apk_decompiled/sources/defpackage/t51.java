package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t51 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ t51(int i, zy7 zy7Var) {
        this.E = 3;
        this.F = i;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                x51 x51Var = (x51) this.G;
                AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(x51Var.b).setContentType(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(x51Var.a).setChannelMask(4).build()).setTransferMode(1).setBufferSizeInBytes(this.F * 2).build();
                audioTrackBuild.getClass();
                return audioTrackBuild;
            case 1:
                em2 em2Var = (em2) this.G;
                return Boolean.valueOf(((Boolean) em2Var.v.getValue()).booleanValue() || em2Var.u.h() != this.F);
            case 2:
                x0a x0aVar = (x0a) this.G;
                int i = this.F;
                p0a p0aVarH = x0aVar.h();
                int i2 = p0aVarH.m - p0aVarH.q;
                q0a q0aVar = (q0a) w44.V0(p0aVarH.k);
                if (q0aVar != null && (q0aVar.a < i || q0aVar.p > i2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return new xs5(this.F, MTTypesetterKt.kLineSkipLimitMultiplier, (zy7) this.G);
            case 4:
                return Integer.valueOf(((tgf) this.G).f.b.d(this.F));
            case 5:
                return Float.valueOf(1.0f - wd6.d0(Math.abs(((hsc) ((koc) this.G).d.H).h() + (((isc) r0.d.G).h() - this.F)), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
            default:
                l5j l5jVar = (l5j) this.G;
                if (l5jVar.l == this.F) {
                    l5jVar.h.abandonAudioFocusRequest(l5jVar.i);
                }
                return iei.a;
        }
    }

    public /* synthetic */ t51(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }
}
