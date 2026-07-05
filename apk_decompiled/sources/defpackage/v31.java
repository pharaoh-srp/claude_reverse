package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v31 extends AudioDeviceCallback {
    public final /* synthetic */ x31 a;

    public v31(x31 x31Var) {
        this.a = x31Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.c();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        x31 x31Var = this.a;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) x31Var.N;
        String str = tpi.a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], audioDeviceInfo)) {
                x31Var.N = null;
                break;
            }
            i++;
        }
        x31Var.c();
    }
}
