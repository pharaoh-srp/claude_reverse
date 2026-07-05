package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.health.platform.client.proto.g;
import com.datadog.android.rum.internal.domain.scope.d;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fd implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ fd(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x31 x31Var;
        int i = 1;
        String str = null;
        switch (this.E) {
            case 0:
                gd gdVar = (gd) this.F;
                Activity activity = (Activity) this.G;
                h99 h99VarB = gdVar.b();
                try {
                    cye cyeVarD = gdVar.d();
                    if (cyeVarD != null) {
                        cyeVarD.r(activity, nm6.E);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    dch.I(h99VarB, 5, x44.X(g99.F, g99.G), n.d0, e, 48);
                    return;
                }
            case 1:
                tpk.b((a10) this.F, (LongSparseArray) this.G);
                return;
            case 2:
                n11 n11Var = (n11) this.F;
                yw5 yw5Var = (yw5) this.G;
                ((f6b) n11Var.I).h();
                q11 q11Var = (q11) n11Var.H;
                synchronized (q11Var.a) {
                    q11Var.b();
                    yw5Var.run();
                    break;
                }
                return;
            case 3:
                Context context = (Context) this.F;
                hf4 hf4Var = (hf4) this.G;
                x41.a = (AudioManager) context.getSystemService("audio");
                hf4Var.c();
                return;
            case 4:
                i49 i49Var = (i49) this.F;
                synchronized (((qo5) this.G)) {
                }
                r77 r77Var = (r77) i49Var.G;
                String str2 = tpi.a;
                hp5 hp5Var = r77Var.E.s;
                hp5Var.H(hp5Var.D((z7b) hp5Var.d.f), 1013, new ep5(i));
                return;
            case 5:
                i49 i49Var2 = (i49) this.F;
                p34 p34Var = (p34) this.G;
                r77 r77Var2 = (r77) i49Var2.G;
                String str3 = tpi.a;
                qb5.d(r77Var2.E.F, p34Var);
                return;
            case 6:
                c61 c61Var = (c61) this.F;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.G).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) c61Var.H).post(new fd(c61Var, 7, routedDevice));
                    return;
                }
                return;
            case 7:
                c61 c61Var2 = (c61) this.F;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.G;
                if (((b61) c61Var2.I) == null || (x31Var = ((i61) ((poj) c61Var2.G).E).i) == null || audioDeviceInfo.equals((AudioDeviceInfo) x31Var.N)) {
                    return;
                }
                x31Var.N = audioDeviceInfo;
                Context context2 = (Context) x31Var.F;
                p31 p31Var = (p31) x31Var.O;
                List listA = x31Var.a();
                vde vdeVar = u31.e;
                x31Var.b(u31.b(context2, context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), p31Var, audioDeviceInfo, listA));
                return;
            case 8:
                ig0 ig0Var = (ig0) this.F;
                Object objApply = ((dp5) this.G).apply(ig0Var.J);
                ig0Var.J = objApply;
                hc1 hc1Var = new hc1(ig0Var, objApply, i);
                k1h k1hVar = (k1h) ig0Var.G;
                if (k1hVar.a.getLooper().getThread().isAlive()) {
                    k1hVar.d(hc1Var);
                    return;
                }
                return;
            case 9:
                ((ey1) this.F).c((Context) this.G);
                return;
            case 10:
                bgj bgjVar = (bgj) this.F;
                String string = ((UUID) this.G).toString();
                string.getClass();
                kxk.l(bgjVar, string);
                return;
            case 11:
                List list = (List) this.F;
                ml4 ml4Var = (ml4) this.G;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((td1) it.next()).a(ml4Var.e);
                }
                return;
            case 12:
                CreateDigitalCredentialController.handleResponse$lambda$4$0((CreateDigitalCredentialController) this.F, (l65) this.G);
                return;
            case 13:
                CreatePasswordCredentialController.handleResponse$lambda$3$0((CreatePasswordCredentialController) this.F, (l65) this.G);
                return;
            case 14:
                ((m95) this.F).a((CreateCredentialException) this.G);
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                CreatePublicKeyCredentialController.handleResponse$lambda$3$0((CreatePublicKeyCredentialController) this.F, (l65) this.G);
                return;
            case 16:
                CredentialProviderBeginSignInController.handleResponse$lambda$5$0((CredentialProviderBeginSignInController) this.F, (GetCredentialUnknownException) this.G);
                return;
            case g.MAX_FIELD_NUMBER /* 17 */:
                CredentialProviderBeginSignInController.handleResponse$lambda$2$0((CredentialProviderBeginSignInController) this.F, (u38) this.G);
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                CredentialProviderBeginSignInController.handleResponse$lambda$3$0((CredentialProviderBeginSignInController) this.F, (dae) this.G);
                return;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((m95) this.F).a(this.G);
                return;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                CredentialProviderCreatePasswordController.handleResponse$lambda$2$0((CredentialProviderCreatePasswordController) this.F, (l65) this.G);
                return;
            case 21:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$4$0((CredentialProviderCreatePublicKeyCredentialController) this.F, (l65) this.G);
                return;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$5$0((CredentialProviderGetSignInIntentController) this.F, (GetCredentialUnknownException) this.G);
                return;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$3$0((CredentialProviderGetSignInIntentController) this.F, (dae) this.G);
                return;
            case 24:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$2$0((CredentialProviderGetSignInIntentController) this.F, (u38) this.G);
                return;
            case BuildConfig.VERSION_CODE /* 25 */:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0$0((CredentialProviderGetSignInIntentController) this.F, (GetCredentialUnsupportedException) this.G);
                return;
            case 26:
                DatadogRumMonitor datadogRumMonitor = (DatadogRumMonitor) this.F;
                h4 h4Var = (h4) this.G;
                d dVarE = datadogRumMonitor.f.e();
                if (dVarE != null) {
                    sxe sxeVarD = dVarE.d();
                    String str4 = sxeVarD.b;
                    if (sxeVarD.m != 1 && !x44.r(str4, sxe.p)) {
                        str = str4;
                    }
                }
                h4Var.invoke(str);
                return;
            case 27:
                poj pojVar = (poj) this.F;
                exf exfVar = (exf) this.G;
                synchronized (((HashSet) pojVar.E)) {
                    ((HashSet) pojVar.E).remove(exfVar);
                    break;
                }
                return;
            case 28:
                ViewGroup viewGroup = (ViewGroup) this.F;
                viewGroup.getClass();
                viewGroup.endViewTransition(null);
                throw null;
            default:
                ((wv5) ((qb5) this.F).F).h.a((yui) this.G);
                return;
        }
    }
}
