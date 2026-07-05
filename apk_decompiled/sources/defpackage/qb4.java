package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qb4 implements tz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ qb4(int i) {
        this.E = i;
    }

    @Override // defpackage.tz7
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.E;
        int i2 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                meh mehVar = (meh) obj;
                beh behVar = (beh) obj2;
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var = (ld4) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i3 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((e18) ld4Var).f(mehVar) : ((e18) ld4Var).h(mehVar) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i3 |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(behVar) : ((e18) ld4Var).h(behVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if (((e18) ld4Var).h(zy7Var)) {
                        i2 = 256;
                    }
                    i3 |= i2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
                    e18Var.T();
                } else {
                    ou5.c(mehVar, behVar, zy7Var, e18Var, i3 & 1022);
                }
                break;
            case 1:
                meh mehVar2 = (meh) obj;
                beh behVar2 = (beh) obj2;
                zy7 zy7Var2 = (zy7) obj3;
                ld4 ld4Var2 = (ld4) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((e18) ld4Var2).f(mehVar2) : ((e18) ld4Var2).h(mehVar2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var2).f(behVar2) : ((e18) ld4Var2).h(behVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (((e18) ld4Var2).h(zy7Var2)) {
                        i2 = 256;
                    }
                    i4 |= i2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i4 & 1, (i4 & 1171) != 1170)) {
                    e18Var2.T();
                } else {
                    ou5.c(mehVar2, behVar2, zy7Var2, e18Var2, i4 & 1022);
                }
                break;
            case 2:
                ((Boolean) obj2).getClass();
                ld4 ld4Var3 = (ld4) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ((vhd) obj).getClass();
                ((zy7) obj3).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 1025) != 1024)) {
                    e18Var3.T();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                kkh kkhVar = (kkh) obj5;
                String string = ((CharSequence) obj4).subSequence(kkh.g(kkhVar.a), kkh.f(kkhVar.a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return ieiVar;
    }
}
