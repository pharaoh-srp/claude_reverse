package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class npk {
    public static final ta4 a = new ta4(2144011905, false, new ub4(7));
    public static final ta4 b = new ta4(-180080573, false, new tb4(13));
    public static final ta4 c = new ta4(-677900811, false, new tb4(14));
    public static Context d;
    public static b7k e;

    public static final void a(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i3;
        iqb iqbVar2;
        int i4;
        e18 e18Var;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(787392075);
        if ((i & 6) == 0) {
            i3 = i | (e18Var2.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i4 = i3 | (e18Var2.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var = e18Var2;
            int i6 = (i4 & 112) | 196608 | (i4 & 896) | ((i4 << 12) & 57344);
            iqb iqbVar4 = i5 != 0 ? fqb.E : iqbVar2;
            gjk.c(euk.o(z, e18Var2), zy7Var, iqbVar4, false, z, xuj.a, !z, null, false, null, null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, false, null, e18Var, i6, 0, 524168);
            iqbVar3 = iqbVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xw(z, zy7Var, iqbVar3, i, i2, 0);
        }
    }

    public static final String b(String str) {
        String host;
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri.getScheme() == null || uri.getHost() == null) {
            return null;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme(uri.getScheme());
        if (uri.getPort() == -1) {
            host = uri.getHost();
        } else {
            host = uri.getHost() + ":" + uri.getPort();
        }
        return builderScheme.encodedAuthority(host).encodedPath(uri.getEncodedPath()).build().toString();
    }

    public static String c(i22 i22Var) {
        StringBuilder sb = new StringBuilder(i22Var.size());
        for (int i = 0; i < i22Var.size(); i++) {
            byte bA = i22Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String d(String str) {
        str.getClass();
        return bsg.c1(str, "path=", "");
    }

    public static poe e(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("viewport");
            return new poe(bh9VarS != null ? zrk.l(bh9VarS.g()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Display", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Display", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Display", e4);
            return null;
        }
    }

    public static final e38 f(d38 d38Var) {
        return new e38(d38Var);
    }

    public static final d38 g(qw5 qw5Var) {
        p6i p6iVarF = j8.F(qw5Var, e38.T);
        e38 e38Var = p6iVarF instanceof e38 ? (e38) p6iVarF : null;
        if (e38Var != null) {
            return e38Var.S;
        }
        return null;
    }

    public static final void h(u0 u0Var, bz7 bz7Var) {
        j8.m0(u0Var, e38.T, new f7(11, bz7Var));
    }

    public static b7k i(Context context) throws GooglePlayServicesNotAvailableException {
        dgj.v(context);
        "preferredRenderer: ".concat("null");
        b7k b7kVar = e;
        if (b7kVar != null) {
            return b7kVar;
        }
        int i = y88.e;
        int iB = z88.b(context, 13400000);
        if (iB != 0) {
            throw new GooglePlayServicesNotAvailableException(iB);
        }
        b7k b7kVarK = k(context, 0);
        e = b7kVarK;
        try {
            Parcel parcelF = b7kVarK.F(b7kVarK.H(), 9);
            int i2 = parcelF.readInt();
            parcelF.recycle();
            String packageName = context.getPackageName();
            if (i2 == 2 && !packageName.equals("com.google.android.apps.photos")) {
                try {
                    b7k b7kVar2 = e;
                    cbc cbcVar = new cbc(j(context, 0));
                    Parcel parcelH = b7kVar2.H();
                    gyj.d(parcelH, cbcVar);
                    b7kVar2.L(parcelH, 11);
                } catch (RemoteException e2) {
                    poc.q(e2);
                    return null;
                } catch (UnsatisfiedLinkError unused) {
                    Log.w("npk", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    d = null;
                    e = k(context, 1);
                }
            }
            try {
                b7k b7kVar3 = e;
                cbc cbcVar2 = new cbc(j(context, 0).getResources());
                Parcel parcelH2 = b7kVar3.H();
                gyj.d(parcelH2, cbcVar2);
                parcelH2.writeInt(19020000);
                b7kVar3.L(parcelH2, 6);
                return e;
            } catch (RemoteException e3) {
                poc.q(e3);
                return null;
            }
        } catch (RemoteException e4) {
            poc.q(e4);
            return null;
        }
    }

    public static Context j(Context context, int i) {
        Context contextCreatePackageContext;
        Context context2 = d;
        if (context2 == null) {
            String str = i == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
            context2 = null;
            try {
                contextCreatePackageContext = si6.c(context, si6.b, str).a;
            } catch (Exception e2) {
                try {
                    if (str.equals("com.google.android.gms.maps_dynamite")) {
                        Log.e("npk", "Failed to load maps module, use pre-Chimera", e2);
                        int i2 = y88.e;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    } else {
                        try {
                            contextCreatePackageContext = si6.c(context, si6.b, "com.google.android.gms.maps_dynamite").a;
                        } catch (Exception e3) {
                            Log.e("npk", "Failed to load maps module, use pre-Chimera", e3);
                            int i3 = y88.e;
                            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
            }
            d = contextCreatePackageContext;
            if (contextCreatePackageContext != null) {
                return contextCreatePackageContext;
            }
            pmf.o("Unable to load maps module, maps container context is null");
        }
        return context2;
    }

    public static b7k k(Context context, int i) {
        Log.i("npk", "Making Creator dynamically");
        ClassLoader classLoader = j(context, i).getClassLoader();
        try {
            dgj.v(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    return iInterfaceQueryLocalInterface instanceof b7k ? (b7k) iInterfaceQueryLocalInterface : new b7k(iBinder, "com.google.android.gms.maps.internal.ICreator", 3);
                }
                pmf.o("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                return null;
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e2);
            } catch (InstantiationException e3) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e4);
        }
    }
}
