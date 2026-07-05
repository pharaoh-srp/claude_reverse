package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionCategory;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionType;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class dyc extends iwe {
    public final Context b;
    public final myh c;
    public final dyh d;
    public final qi3 e;
    public final zy1 f;
    public final wz5 g;
    public final wz5 h;
    public final wz5 i;

    public dyc(Context context, myh myhVar, h86 h86Var, dyh dyhVar, qi3 qi3Var) {
        super(h86Var);
        this.b = context;
        this.c = myhVar;
        this.d = dyhVar;
        this.e = qi3Var;
        this.f = x44.a();
        final int i = 0;
        this.g = mpk.w(new zy7(this) { // from class: cyc
            public final /* synthetic */ dyc F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                dyc dycVar = this.F;
                switch (i2) {
                    case 0:
                        myh myhVar2 = dycVar.c;
                        ayh ayhVar = ayh.F;
                        return new vxc(R.string.permission_location_title, R.string.permission_location_description, R.string.permission_location_system_disabled, dycVar.d.b(ayhVar), null, !myhVar2.n(ayhVar), myhVar2.m(ayhVar), null, 144);
                    case 1:
                        myh myhVar3 = dycVar.c;
                        zxh zxhVar = zxh.F;
                        return new vxc(R.string.permission_health_title, R.string.permission_health_description, R.string.permission_health_system_disabled, dycVar.d.b(zxhVar), null, !myhVar3.n(zxhVar), myhVar3.m(zxhVar), new d54(d54.h), 16);
                    default:
                        myh myhVar4 = dycVar.c;
                        dyh dyhVar2 = dycVar.d;
                        xxh xxhVar = xxh.F;
                        boolean zN = myhVar4.n(xxhVar);
                        yxh yxhVar = yxh.F;
                        return new vxc(R.string.permission_calendar_title, R.string.permission_calendar_description, R.string.permission_calendar_system_disabled, dyhVar2.b(xxhVar), dyhVar2.b(yxhVar), (zN || myhVar4.n(yxhVar)) ? false : true, myhVar4.m(xxhVar) || myhVar4.m(yxhVar), null, FreeTypeConstants.FT_LOAD_PEDANTIC);
                }
            }
        });
        final int i2 = 1;
        this.h = mpk.w(new zy7(this) { // from class: cyc
            public final /* synthetic */ dyc F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                dyc dycVar = this.F;
                switch (i22) {
                    case 0:
                        myh myhVar2 = dycVar.c;
                        ayh ayhVar = ayh.F;
                        return new vxc(R.string.permission_location_title, R.string.permission_location_description, R.string.permission_location_system_disabled, dycVar.d.b(ayhVar), null, !myhVar2.n(ayhVar), myhVar2.m(ayhVar), null, 144);
                    case 1:
                        myh myhVar3 = dycVar.c;
                        zxh zxhVar = zxh.F;
                        return new vxc(R.string.permission_health_title, R.string.permission_health_description, R.string.permission_health_system_disabled, dycVar.d.b(zxhVar), null, !myhVar3.n(zxhVar), myhVar3.m(zxhVar), new d54(d54.h), 16);
                    default:
                        myh myhVar4 = dycVar.c;
                        dyh dyhVar2 = dycVar.d;
                        xxh xxhVar = xxh.F;
                        boolean zN = myhVar4.n(xxhVar);
                        yxh yxhVar = yxh.F;
                        return new vxc(R.string.permission_calendar_title, R.string.permission_calendar_description, R.string.permission_calendar_system_disabled, dyhVar2.b(xxhVar), dyhVar2.b(yxhVar), (zN || myhVar4.n(yxhVar)) ? false : true, myhVar4.m(xxhVar) || myhVar4.m(yxhVar), null, FreeTypeConstants.FT_LOAD_PEDANTIC);
                }
            }
        });
        final int i3 = 2;
        this.i = mpk.w(new zy7(this) { // from class: cyc
            public final /* synthetic */ dyc F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                dyc dycVar = this.F;
                switch (i22) {
                    case 0:
                        myh myhVar2 = dycVar.c;
                        ayh ayhVar = ayh.F;
                        return new vxc(R.string.permission_location_title, R.string.permission_location_description, R.string.permission_location_system_disabled, dycVar.d.b(ayhVar), null, !myhVar2.n(ayhVar), myhVar2.m(ayhVar), null, 144);
                    case 1:
                        myh myhVar3 = dycVar.c;
                        zxh zxhVar = zxh.F;
                        return new vxc(R.string.permission_health_title, R.string.permission_health_description, R.string.permission_health_system_disabled, dycVar.d.b(zxhVar), null, !myhVar3.n(zxhVar), myhVar3.m(zxhVar), new d54(d54.h), 16);
                    default:
                        myh myhVar4 = dycVar.c;
                        dyh dyhVar2 = dycVar.d;
                        xxh xxhVar = xxh.F;
                        boolean zN = myhVar4.n(xxhVar);
                        yxh yxhVar = yxh.F;
                        return new vxc(R.string.permission_calendar_title, R.string.permission_calendar_description, R.string.permission_calendar_system_disabled, dyhVar2.b(xxhVar), dyhVar2.b(yxhVar), (zN || myhVar4.n(yxhVar)) ? false : true, myhVar4.m(xxhVar) || myhVar4.m(yxhVar), null, FreeTypeConstants.FT_LOAD_PEDANTIC);
                }
            }
        });
    }

    public final void O() {
        if (vjk.f(this.b)) {
            return;
        }
        this.f.r(new tt6(true));
    }

    public final void P(MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, eyh eyhVar, eyh eyhVar2, MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType) {
        this.e.e(new MobileAppUseEvents$MobileAppUsePermissionChanged(mobileAppUseEvents$MobileAppUsePermissionCategory, eyhVar.b(), eyhVar2.b(), MobileAppUseEvents$MobileAppUsePermissionChangedSource.SETTINGS, "", mobileAppUseEvents$MobileAppUsePermissionType), MobileAppUseEvents$MobileAppUsePermissionChanged.Companion.serializer());
    }
}
