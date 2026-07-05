package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l41 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ p41 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l41(int i, p41 p41Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = i;
        this.H = p41Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        p41 p41Var = this.H;
        switch (i) {
            case 0:
                l41 l41Var = new l41(0, p41Var, tp4Var);
                l41Var.G = obj;
                return l41Var;
            case 1:
                l41 l41Var2 = new l41(1, p41Var, tp4Var);
                l41Var2.G = obj;
                return l41Var2;
            case 2:
                l41 l41Var3 = new l41(2, p41Var, tp4Var);
                l41Var3.G = obj;
                return l41Var3;
            default:
                l41 l41Var4 = new l41(3, p41Var, tp4Var);
                l41Var4.G = obj;
                return l41Var4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        aid aidVar = (aid) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((l41) create(aidVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, m41] */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        m45 m45Var = m45.E;
        final p41 p41Var = this.H;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                aid aidVar = (aid) this.G;
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    k41 k41Var = new k41(aidVar, p41Var, 0);
                    AudioManager audioManager = p41Var.b;
                    if (audioManager != null) {
                        audioManager.registerAudioDeviceCallback(k41Var, null);
                    }
                    aidVar.r(p41.a(p41Var));
                    k6 k6Var = new k6(p41Var, 23, k41Var);
                    this.G = null;
                    this.F = 1;
                    if (v40.k(aidVar, k6Var, this) == m45Var) {
                    }
                }
                break;
            case 1:
                aid aidVar2 = (aid) this.G;
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    iik.i(aidVar2, p41Var.h());
                    k41 k41Var2 = new k41(aidVar2, p41Var, 1);
                    AudioManager audioManager2 = p41Var.b;
                    if (audioManager2 != null) {
                        audioManager2.registerAudioDeviceCallback(k41Var2, null);
                    }
                    k6 k6Var2 = new k6(p41Var, 24, k41Var2);
                    this.G = null;
                    this.F = 1;
                    if (v40.k(aidVar2, k6Var2, this) == m45Var) {
                    }
                }
                break;
            case 2:
                aid aidVar3 = (aid) this.G;
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 == 1 || i4 == 2) {
                        sf5.h0(obj);
                    } else {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    AudioManager audioManager3 = p41Var.b;
                    if (Build.VERSION.SDK_INT < 31 || audioManager3 == null) {
                        aidVar3.r(new cpc("", ""));
                        oob oobVar = new oob(19);
                        this.G = null;
                        this.F = 1;
                        if (v40.k(aidVar3, oobVar, this) == m45Var) {
                        }
                    } else {
                        j41 j41Var = new j41(aidVar3, 1);
                        audioManager3.addOnCommunicationDeviceChangedListener(d4c.C(p41Var.a.b()), j41Var);
                        aidVar3.r(jvk.l(audioManager3.getCommunicationDevice()));
                        k6 k6Var3 = new k6(audioManager3, 25, j41Var);
                        this.G = null;
                        this.F = 2;
                        if (v40.k(aidVar3, k6Var3, this) == m45Var) {
                        }
                    }
                }
                break;
            default:
                final aid aidVar4 = (aid) this.G;
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 == 1 || i5 == 2) {
                        sf5.h0(obj);
                    } else {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    AudioManager audioManager4 = p41Var.b;
                    if (Build.VERSION.SDK_INT < 31 || audioManager4 == null) {
                        aidVar4.r(null);
                        oob oobVar2 = new oob(19);
                        this.G = null;
                        this.F = 1;
                        if (v40.k(aidVar4, oobVar2, this) == m45Var) {
                        }
                    } else {
                        ?? r1 = new AudioManager.OnCommunicationDeviceChangedListener() { // from class: m41
                            @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
                            public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                                aid aidVar5 = aidVar4;
                                p41 p41Var2 = p41Var;
                                zfa.a.getClass();
                                if (yfa.b()) {
                                    String strE = iuj.E(aidVar5);
                                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : copyOnWriteArrayList) {
                                        ((n30) ((zfa) obj2)).getClass();
                                        arrayList.add(obj2);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        zfa.a.getClass();
                                        String str = "watchCurrentRoute: type=" + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getType()) : null) + " id=" + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null) + " name=" + ((Object) (audioDeviceInfo != null ? audioDeviceInfo.getProductName() : null));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, str);
                                        }
                                    }
                                }
                                aidVar5.r(audioDeviceInfo != null ? p41.b(p41Var2, audioDeviceInfo) : null);
                            }
                        };
                        audioManager4.addOnCommunicationDeviceChangedListener(d4c.C(p41Var.a.b()), r1);
                        AudioDeviceInfo communicationDevice = audioManager4.getCommunicationDevice();
                        aidVar4.r(communicationDevice != null ? p41.b(p41Var, communicationDevice) : null);
                        k6 k6Var4 = new k6(audioManager4, 26, r1);
                        this.G = null;
                        this.F = 2;
                        if (v40.k(aidVar4, k6Var4, this) == m45Var) {
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }
}
