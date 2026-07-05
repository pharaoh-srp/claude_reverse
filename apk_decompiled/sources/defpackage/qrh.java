package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* JADX INFO: loaded from: classes2.dex */
public final class qrh extends md1 {
    @Override // defpackage.md1
    public final i51 a(i51 i51Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = i51Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new i51(i51Var.a, i51Var.b, 2) : i51.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i51Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // defpackage.m51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.nio.ByteBuffer r13) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrh.g(java.nio.ByteBuffer):void");
    }
}
