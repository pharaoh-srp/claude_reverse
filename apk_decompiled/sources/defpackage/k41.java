package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class k41 extends AudioDeviceCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ aid b;
    public final /* synthetic */ p41 c;

    public /* synthetic */ k41(aid aidVar, p41 p41Var, int i) {
        this.a = i;
        this.b = aidVar;
        this.c = p41Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.a;
        p41 p41Var = this.c;
        aid aidVar = this.b;
        switch (i) {
            case 0:
                aidVar.r(p41.a(p41Var));
                break;
            default:
                iik.i(aidVar, p41Var.h());
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.a;
        p41 p41Var = this.c;
        aid aidVar = this.b;
        switch (i) {
            case 0:
                aidVar.r(p41.a(p41Var));
                break;
            default:
                iik.i(aidVar, p41Var.h());
                break;
        }
    }
}
