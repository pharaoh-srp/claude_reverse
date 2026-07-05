package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j41 implements AudioManager.OnCommunicationDeviceChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ aid b;

    public /* synthetic */ j41(aid aidVar, int i) {
        this.a = i;
        this.b = aidVar;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        int i = this.a;
        aid aidVar = this.b;
        switch (i) {
            case 0:
                aidVar.r(audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null);
                break;
            default:
                aidVar.r(jvk.l(audioDeviceInfo));
                break;
        }
    }
}
