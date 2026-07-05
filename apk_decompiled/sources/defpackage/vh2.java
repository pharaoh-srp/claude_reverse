package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vh2 extends md1 {
    public int[] i;
    public int[] j;

    @Override // defpackage.md1
    public final i51 a(i51 i51Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = i51Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return i51.e;
        }
        int i2 = i51Var.b;
        if (!tpi.y(i)) {
            throw new AudioProcessor$UnhandledAudioFormatException(i51Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", i51Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new i51(i51Var.a, iArr.length, i) : i51.e;
    }

    @Override // defpackage.md1
    public final void b() {
        this.j = this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    @Override // defpackage.m51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh2.g(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.md1
    public final void l() {
        this.j = null;
        this.i = null;
    }
}
