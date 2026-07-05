package defpackage;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w41 {
    public final int a;
    public final t41 b;
    public final Handler c;
    public final p31 d;
    public final AudioFocusRequest e;

    public w41(int i, t41 t41Var, Handler handler, p31 p31Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = p31Var;
        this.b = t41Var;
        this.e = new AudioFocusRequest.Builder(i).setAudioAttributes(p31Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(t41Var, handler).setAcceptsDelayedFocusGain(z).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w41) {
            w41 w41Var = (w41) obj;
            if (this.a == w41Var.a && this.b == w41Var.b && Objects.equals(this.c, w41Var.c) && Objects.equals(this.d, w41Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.FALSE);
    }
}
