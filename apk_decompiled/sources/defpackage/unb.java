package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class unb implements br4, ia4, b45, ut9, ivg, dhh, sac, m96, azg, i29, tzb, occ, oid {
    public static final unb F = new unb(1);
    public static final /* synthetic */ unb G = new unb(2);
    public static final unb H = new unb(3);
    public static final /* synthetic */ unb I = new unb(4);
    public static final unb J = new unb(5);
    public static final unb K = new unb(6);
    public static final /* synthetic */ unb L = new unb(7);
    public static final phf M = new phf(0);
    public static final phf N = new phf(1);
    public static final phf O = new phf(2);
    public static final phf P = new phf(3);
    public static final phf Q = new phf(4);
    public static final unb R = new unb(9);
    public static final /* synthetic */ unb S = new unb(10);
    public static final /* synthetic */ unb T = new unb(11);
    public final /* synthetic */ int E;

    public /* synthetic */ unb(int i) {
        this.E = i;
    }

    private final void g() {
    }

    private final void i() {
    }

    @Override // defpackage.occ
    public int D(int i) {
        return i;
    }

    @Override // defpackage.i29
    public c29 a() {
        switch (this.E) {
            case 21:
                return new j5();
            default:
                return new k86(null);
        }
    }

    @Override // defpackage.m96
    public List b(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return mp0.Y0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // defpackage.i29
    public void c() {
        int i = this.E;
    }

    @Override // defpackage.ivg
    public void d(hvg hvgVar) {
        hvgVar.clear();
    }

    @Override // defpackage.ivg
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.tzb
    public void f(qj5 qj5Var) {
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        ((rqe) obj).close();
        return iei.a;
    }

    @Override // defpackage.azg
    public bzg j(w47 w47Var) {
        return new ry7((Context) w47Var.c, (String) w47Var.d, (g11) w47Var.e, w47Var.a, w47Var.b);
    }

    @Override // defpackage.occ
    public int l(int i) {
        return i;
    }

    @Override // defpackage.oid
    public void n(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.ut9
    public Object o(ja8 ja8Var, tp4 tp4Var) {
        return Bitmap.createBitmap(new xt9(ja8Var));
    }

    @Override // defpackage.sac
    public Object o0() {
        return new q7a(true);
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        int i = 0;
        switch (this.E) {
            case 3:
                Object objI = el5Var.i(new qzd(z4a.class, Executor.class));
                objI.getClass();
                return d4c.N((Executor) objI);
            case 10:
                return new unb(i);
            default:
                xzk.I();
                return new efk(i);
        }
    }

    public String toString() {
        switch (this.E) {
            case 9:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }
}
