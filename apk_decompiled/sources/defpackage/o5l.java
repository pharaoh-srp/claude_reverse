package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.health.platform.client.impl.ipc.ApiVersionException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class o5l implements s08, cfd {
    public static o5l J;
    public static HandlerThread K;
    public static Handler L;
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;

    public o5l(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        this.E = 7;
        dfd dfdVar = new dfd(this);
        this.G = dfdVar;
        if (!gid.b(2)) {
            rl7.j("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.H = str;
        this.I = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.F = 20;
                break;
            case "HMACSHA224":
                this.F = 28;
                break;
            case "HMACSHA256":
                this.F = 32;
                break;
            case "HMACSHA384":
                this.F = 48;
                break;
            case "HMACSHA512":
                this.F = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        dfdVar.get();
    }

    public static void b(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    public static synchronized o5l j(Context context) {
        try {
            if (J == null) {
                J = new o5l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new vk5("MessengerIpcClient", 1))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return J;
    }

    public void a(Activity activity) {
        if (K == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            K = handlerThread;
            handlerThread.start();
            L = new Handler(K.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) this.G;
            if (sparseIntArrayArr[i] == null && (this.F & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((gy7) this.I, L);
        ((ArrayList) this.H).add(new WeakReference(activity));
    }

    public mp3 c() {
        return (mp3) this.G;
    }

    public xzd d() throws RemoteException {
        if (this.F != 2 || ((nt8) this.H) == null || ((v59) this.I) == null) {
            sz6.j("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", ((Context) this.G).getPackageName());
        try {
            return new xzd(4, ((lt8) ((nt8) this.H)).b(bundle));
        } catch (RemoteException e) {
            wvk.k("RemoteException getting install referrer information");
            this.F = 0;
            throw e;
        }
    }

    public SparseIntArray[] e() {
        return (SparseIntArray[]) this.G;
    }

    public int f() {
        return this.F;
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.G) {
            try {
                fd9.M(this.F > 0);
                int i = this.F - 1;
                this.F = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.I) != null) {
                    handlerThread.quit();
                    this.I = null;
                    this.H = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SparseIntArray[] h() {
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) this.G;
        this.G = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    public void i(c61 c61Var) {
        ServiceInfo serviceInfo;
        Context context = (Context) this.G;
        int i = this.F;
        int i2 = 0;
        if (i == 2 && ((nt8) this.H) != null && ((v59) this.I) != null) {
            wvk.j("Service connection is valid. No need to re-initialize.");
            c61Var.D(0);
            return;
        }
        if (i == 1) {
            wvk.k("Client is already in the process of connecting to the service.");
            c61Var.D(3);
            return;
        }
        if (i == 3) {
            wvk.k("Client was already closed and can't be reused. Please create another instance.");
            c61Var.D(3);
            return;
        }
        wvk.j("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.F = 0;
            wvk.j("Install Referrer service unavailable on device.");
            c61Var.D(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", FreeTypeConstants.FT_LOAD_PEDANTIC).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    v59 v59Var = new v59(this, i2, c61Var);
                    this.I = v59Var;
                    try {
                        if (context.bindService(intent2, v59Var, 1)) {
                            wvk.j("Service was bonded successfully.");
                            return;
                        }
                        wvk.k("Connection to service is blocked.");
                        this.F = 0;
                        c61Var.D(1);
                        return;
                    } catch (SecurityException unused) {
                        wvk.k("No permission to connect to service.");
                        this.F = 0;
                        c61Var.D(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        wvk.k("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.F = 0;
        c61Var.D(2);
    }

    @Override // defpackage.cfd
    public byte[] k(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        dfd dfdVar = (dfd) this.G;
        if (i > this.F) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) dfdVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) dfdVar.get()).doFinal(), i);
    }

    public r5l l(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.F;
            this.F = i2 + 1;
        }
        return n(new t3l(i2, i, bundle, 0));
    }

    public r5l m(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.F;
            this.F = i2 + 1;
        }
        return n(new t3l(i2, i, bundle, 1));
    }

    public synchronized r5l n(t3l t3lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(t3lVar.toString());
            }
            if (!((v1l) this.I).d(t3lVar)) {
                v1l v1lVar = new v1l(this);
                this.I = v1lVar;
                v1lVar.d(t3lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return t3lVar.b.a;
    }

    @Override // defpackage.s08
    public void o(Throwable th) {
        ((exf) this.G).m(th);
    }

    @Override // defpackage.s08
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        exf exfVar = (exf) this.G;
        int iIntValue = num.intValue();
        int i = this.F;
        yof yofVar = (yof) this.I;
        qb5 qb5Var = yofVar.a;
        ch4 ch4Var = yofVar.b;
        if (iIntValue >= i) {
            po3 po3Var = new po3(yofVar, qb5Var, (wee) this.H, exfVar);
            Handler handler = ch4Var.F;
            handler.sendMessage(handler.obtainMessage(3, po3Var));
        } else {
            oe1 oe1Var = new oe1(qb5Var);
            Handler handler2 = ch4Var.F;
            handler2.sendMessage(handler2.obtainMessage(3, oe1Var));
            exfVar.m(new ApiVersionException(num.intValue(), i));
        }
    }

    public String toString() {
        switch (this.E) {
            case 5:
                StringBuilder sb = new StringBuilder("{");
                for (int i = 0; i < this.F; i++) {
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(((int[]) this.H)[i]);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o5l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.E = 0;
        this.I = new v1l(this);
        this.F = 1;
        this.H = scheduledExecutorService;
        this.G = context.getApplicationContext();
    }

    public o5l(b80 b80Var, b80 b80Var2, b80 b80Var3, int i) {
        this.E = 1;
        this.G = b80Var;
        this.H = b80Var2;
        this.I = b80Var3;
        this.F = i;
    }

    public o5l(mp3 mp3Var, np3 np3Var, int i, b6d b6dVar) {
        this.E = 8;
        this.G = mp3Var;
        this.H = np3Var;
        this.F = i;
        this.I = b6dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5l(mp3 mp3Var, np3 np3Var, int i) {
        this(mp3Var, np3Var, i, (b6d) null);
        this.E = 8;
    }

    public o5l(Context context) {
        this.E = 4;
        this.F = 0;
        this.G = context.getApplicationContext();
    }

    public o5l() {
        this.E = 6;
        this.G = new Object();
        this.H = null;
        this.I = null;
        this.F = 0;
    }

    public o5l(yof yofVar, int i, exf exfVar, wee weeVar) {
        this.E = 2;
        this.I = yofVar;
        this.F = i;
        this.G = exfVar;
        this.H = weeVar;
    }

    public o5l(int i, int i2) {
        this.E = i2;
        switch (i2) {
            case 5:
                this.I = new int[i];
                this.H = new int[i];
                this.G = new ioa[i];
                break;
            default:
                this.G = new SparseIntArray[9];
                this.H = new ArrayList();
                this.I = new gy7(this);
                this.F = i;
                break;
        }
    }
}
