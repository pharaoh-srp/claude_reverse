package com.anthropic.claude.app.main.loggedout;

import defpackage.bga;
import defpackage.cc;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.q59;
import defpackage.w1a;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/main/loggedout/LoggedOutAppDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "LoginApp", "com/anthropic/claude/app/main/loggedout/a", "Lcom/anthropic/claude/app/main/loggedout/LoggedOutAppDestination$LoginApp;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface LoggedOutAppDestination extends bga {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/main/loggedout/LoggedOutAppDestination$LoginApp;", "Lcom/anthropic/claude/app/main/loggedout/LoggedOutAppDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LoginApp implements LoggedOutAppDestination {
        public static final int $stable = 0;
        public static final LoginApp INSTANCE = new LoginApp();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new q59(22));

        private LoginApp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination.LoginApp", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LoginApp);
        }

        @Override // com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -2008847818;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "LoginApp";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }
}
