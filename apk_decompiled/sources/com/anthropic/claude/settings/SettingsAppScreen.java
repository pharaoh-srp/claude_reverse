package com.anthropic.claude.settings;

import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.types.strings.McpServerId;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pvg;
import defpackage.qy1;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w1e;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.ztf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0016\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0015\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "SettingsScreen", "ProfileScreen", "BillingScreen", "CapabilitiesScreen", "ConnectorsScreen", "ConnectorDirectory", "ConnectorDirectoryDetail", "ConnectedAppsScreen", "PermissionsScreen", "CalendarPermissionScreen", "LocationPermissionScreen", "HealthPermissionScreen", "MobileAppFeedbackScreen", "LicensesScreen", "NotificationSettingsScreen", "PrivacyScreen", "SharedLinksScreen", "McpServerToolsScreen", "UsageScreen", "MemoryFilesScreen", "MemoryFileDetailScreen", "com/anthropic/claude/settings/e", "Lcom/anthropic/claude/settings/SettingsAppScreen$BillingScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$CalendarPermissionScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$CapabilitiesScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectedAppsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorDirectory;", "Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorDirectoryDetail;", "Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$HealthPermissionScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$LicensesScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$LocationPermissionScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$McpServerToolsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$MemoryFileDetailScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$MemoryFilesScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$MobileAppFeedbackScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$NotificationSettingsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$PermissionsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$PrivacyScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$ProfileScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$SettingsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$SharedLinksScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen$UsageScreen;", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface SettingsAppScreen extends bga {
    public static final e Companion = e.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$CalendarPermissionScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CalendarPermissionScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final CalendarPermissionScreen INSTANCE = new CalendarPermissionScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(7));

        private CalendarPermissionScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.CalendarPermissionScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CalendarPermissionScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1660524423;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CalendarPermissionScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$CapabilitiesScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CapabilitiesScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final CapabilitiesScreen INSTANCE = new CapabilitiesScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(8));

        private CapabilitiesScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.CapabilitiesScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CapabilitiesScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1852311728;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CapabilitiesScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectedAppsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ConnectedAppsScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final ConnectedAppsScreen INSTANCE = new ConnectedAppsScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(9));

        private ConnectedAppsScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.ConnectedAppsScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ConnectedAppsScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 2052835225;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ConnectedAppsScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorDirectory;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ConnectorDirectory implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final ConnectorDirectory INSTANCE = new ConnectorDirectory();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(10));

        private ConnectorDirectory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.ConnectorDirectory", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ConnectorDirectory);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1003279314;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ConnectorDirectory";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ConnectorsScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final ConnectorsScreen INSTANCE = new ConnectorsScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(11));

        private ConnectorsScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.ConnectorsScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ConnectorsScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1850490080;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ConnectorsScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$HealthPermissionScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class HealthPermissionScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final HealthPermissionScreen INSTANCE = new HealthPermissionScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(12));

        private HealthPermissionScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.HealthPermissionScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof HealthPermissionScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1385132507;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "HealthPermissionScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$LicensesScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LicensesScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final LicensesScreen INSTANCE = new LicensesScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(13));

        private LicensesScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.LicensesScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LicensesScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 80739820;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "LicensesScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$LocationPermissionScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LocationPermissionScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final LocationPermissionScreen INSTANCE = new LocationPermissionScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(14));

        private LocationPermissionScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.LocationPermissionScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LocationPermissionScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1343778302;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "LocationPermissionScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$MemoryFilesScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MemoryFilesScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final MemoryFilesScreen INSTANCE = new MemoryFilesScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(15));

        private MemoryFilesScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.MemoryFilesScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MemoryFilesScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -569779020;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MemoryFilesScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$MobileAppFeedbackScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MobileAppFeedbackScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final MobileAppFeedbackScreen INSTANCE = new MobileAppFeedbackScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(16));

        private MobileAppFeedbackScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.MobileAppFeedbackScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MobileAppFeedbackScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -466547326;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MobileAppFeedbackScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$NotificationSettingsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class NotificationSettingsScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final NotificationSettingsScreen INSTANCE = new NotificationSettingsScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(17));

        private NotificationSettingsScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.NotificationSettingsScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NotificationSettingsScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 660884936;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NotificationSettingsScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$PermissionsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PermissionsScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final PermissionsScreen INSTANCE = new PermissionsScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(18));

        private PermissionsScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.PermissionsScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PermissionsScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -860149566;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PermissionsScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$PrivacyScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PrivacyScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final PrivacyScreen INSTANCE = new PrivacyScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(19));

        private PrivacyScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.PrivacyScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PrivacyScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1793076678;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PrivacyScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$ProfileScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ProfileScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final ProfileScreen INSTANCE = new ProfileScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(20));

        private ProfileScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.ProfileScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ProfileScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -893995225;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ProfileScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$SharedLinksScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SharedLinksScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final SharedLinksScreen INSTANCE = new SharedLinksScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(21));

        private SharedLinksScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.SharedLinksScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SharedLinksScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 754795154;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SharedLinksScreen";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$UsageScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "settings", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UsageScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final UsageScreen INSTANCE = new UsageScreen();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(22));

        private UsageScreen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.settings.SettingsAppScreen.UsageScreen", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UsageScreen);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 927929759;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UsageScreen";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$SettingsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "", "showReferralSheet", "<init>", "(Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$settings", "(Lcom/anthropic/claude/settings/SettingsAppScreen$SettingsScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/anthropic/claude/settings/SettingsAppScreen$SettingsScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowReferralSheet", "Companion", "com/anthropic/claude/settings/l", "com/anthropic/claude/settings/m", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SettingsScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final m Companion = new m();
        private final boolean showReferralSheet;

        public /* synthetic */ SettingsScreen(int i, boolean z, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.showReferralSheet = false;
            } else {
                this.showReferralSheet = z;
            }
        }

        public static /* synthetic */ SettingsScreen copy$default(SettingsScreen settingsScreen, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = settingsScreen.showReferralSheet;
            }
            return settingsScreen.copy(z);
        }

        public static final /* synthetic */ void write$Self$settings(SettingsScreen self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.showReferralSheet) {
                output.p(serialDesc, 0, self.showReferralSheet);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShowReferralSheet() {
            return this.showReferralSheet;
        }

        public final SettingsScreen copy(boolean showReferralSheet) {
            return new SettingsScreen(showReferralSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SettingsScreen) && this.showReferralSheet == ((SettingsScreen) other).showReferralSheet;
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final boolean getShowReferralSheet() {
            return this.showReferralSheet;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showReferralSheet);
        }

        public String toString() {
            return qy1.g("SettingsScreen(showReferralSheet=", ")", this.showReferralSheet);
        }

        public SettingsScreen() {
            this(false, 1, (mq5) null);
        }

        public SettingsScreen(boolean z) {
            this.showReferralSheet = z;
        }

        public /* synthetic */ SettingsScreen(boolean z, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorDirectoryDetail;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "Lcom/anthropic/claude/api/mcp/DirectoryServer;", "server", "<init>", "(Lcom/anthropic/claude/api/mcp/DirectoryServer;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/mcp/DirectoryServer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$settings", "(Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorDirectoryDetail;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/mcp/DirectoryServer;", "copy", "(Lcom/anthropic/claude/api/mcp/DirectoryServer;)Lcom/anthropic/claude/settings/SettingsAppScreen$ConnectorDirectoryDetail;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/mcp/DirectoryServer;", "getServer", "Companion", "com/anthropic/claude/settings/f", "com/anthropic/claude/settings/g", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ConnectorDirectoryDetail implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final DirectoryServer server;

        public /* synthetic */ ConnectorDirectoryDetail(int i, DirectoryServer directoryServer, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.server = directoryServer;
            } else {
                gvj.f(i, 1, f.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ConnectorDirectoryDetail copy$default(ConnectorDirectoryDetail connectorDirectoryDetail, DirectoryServer directoryServer, int i, Object obj) {
            if ((i & 1) != 0) {
                directoryServer = connectorDirectoryDetail.server;
            }
            return connectorDirectoryDetail.copy(directoryServer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DirectoryServer getServer() {
            return this.server;
        }

        public final ConnectorDirectoryDetail copy(DirectoryServer server) {
            server.getClass();
            return new ConnectorDirectoryDetail(server);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConnectorDirectoryDetail) && x44.r(this.server, ((ConnectorDirectoryDetail) other).server);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final DirectoryServer getServer() {
            return this.server;
        }

        public int hashCode() {
            return this.server.hashCode();
        }

        public String toString() {
            return "ConnectorDirectoryDetail(server=" + this.server + ")";
        }

        public ConnectorDirectoryDetail(DirectoryServer directoryServer) {
            directoryServer.getClass();
            this.server = directoryServer;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$McpServerToolsScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$settings", "(Lcom/anthropic/claude/settings/SettingsAppScreen$McpServerToolsScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "copy-tfiJZf4", "(Ljava/lang/String;)Lcom/anthropic/claude/settings/SettingsAppScreen$McpServerToolsScreen;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerId-owoRr7k", "Companion", "com/anthropic/claude/settings/h", "com/anthropic/claude/settings/i", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class McpServerToolsScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final String serverId;

        private /* synthetic */ McpServerToolsScreen(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.serverId = str;
            } else {
                gvj.f(i, 1, h.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-tfiJZf4$default, reason: not valid java name */
        public static /* synthetic */ McpServerToolsScreen m886copytfiJZf4$default(McpServerToolsScreen mcpServerToolsScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mcpServerToolsScreen.serverId;
            }
            return mcpServerToolsScreen.m888copytfiJZf4(str);
        }

        /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
        public final String getServerId() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: copy-tfiJZf4, reason: not valid java name */
        public final McpServerToolsScreen m888copytfiJZf4(String serverId) {
            serverId.getClass();
            return new McpServerToolsScreen(serverId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof McpServerToolsScreen) && McpServerId.m1032equalsimpl0(this.serverId, ((McpServerToolsScreen) other).serverId);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getServerId-owoRr7k, reason: not valid java name */
        public final String m889getServerIdowoRr7k() {
            return this.serverId;
        }

        public int hashCode() {
            return McpServerId.m1033hashCodeimpl(this.serverId);
        }

        public String toString() {
            return ij0.j("McpServerToolsScreen(serverId=", McpServerId.m1034toStringimpl(this.serverId), ")");
        }

        public /* synthetic */ McpServerToolsScreen(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ McpServerToolsScreen(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private McpServerToolsScreen(String str) {
            str.getClass();
            this.serverId = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$MemoryFileDetailScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "", "path", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$settings", "(Lcom/anthropic/claude/settings/SettingsAppScreen$MemoryFileDetailScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/settings/SettingsAppScreen$MemoryFileDetailScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Companion", "com/anthropic/claude/settings/j", "com/anthropic/claude/settings/k", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MemoryFileDetailScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        public static final k Companion = new k();
        private final String path;

        public /* synthetic */ MemoryFileDetailScreen(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.path = str;
            } else {
                gvj.f(i, 1, j.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ MemoryFileDetailScreen copy$default(MemoryFileDetailScreen memoryFileDetailScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = memoryFileDetailScreen.path;
            }
            return memoryFileDetailScreen.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final MemoryFileDetailScreen copy(String path) {
            path.getClass();
            return new MemoryFileDetailScreen(path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MemoryFileDetailScreen) && x44.r(this.path, ((MemoryFileDetailScreen) other).path);
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return ij0.j("MemoryFileDetailScreen(path=", this.path, ")");
        }

        public MemoryFileDetailScreen(String str) {
            str.getClass();
            this.path = str;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/settings/SettingsAppScreen$BillingScreen;", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "Lpvg;", "subscriptionLevel", "Lcom/anthropic/claude/api/account/RavenType;", "ravenType", "<init>", "(Lpvg;Lcom/anthropic/claude/api/account/RavenType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILpvg;Lcom/anthropic/claude/api/account/RavenType;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$settings", "(Lcom/anthropic/claude/settings/SettingsAppScreen$BillingScreen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lpvg;", "component2", "()Lcom/anthropic/claude/api/account/RavenType;", "copy", "(Lpvg;Lcom/anthropic/claude/api/account/RavenType;)Lcom/anthropic/claude/settings/SettingsAppScreen$BillingScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpvg;", "getSubscriptionLevel", "Lcom/anthropic/claude/api/account/RavenType;", "getRavenType", "Companion", "com/anthropic/claude/settings/c", "com/anthropic/claude/settings/d", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class BillingScreen implements SettingsAppScreen {
        public static final int $stable = 0;
        private final RavenType ravenType;
        private final pvg subscriptionLevel;
        public static final d Companion = new d();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ztf(6)), null};

        public /* synthetic */ BillingScreen(int i, pvg pvgVar, RavenType ravenType, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, c.a.getDescriptor());
                throw null;
            }
            this.subscriptionLevel = pvgVar;
            this.ravenType = ravenType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            pvg[] pvgVarArrValues = pvg.values();
            pvgVarArrValues.getClass();
            return new lq6("com.anthropic.claude.api.account.SubscriptionLevel", (Enum[]) pvgVarArrValues);
        }

        public static /* synthetic */ BillingScreen copy$default(BillingScreen billingScreen, pvg pvgVar, RavenType ravenType, int i, Object obj) {
            if ((i & 1) != 0) {
                pvgVar = billingScreen.subscriptionLevel;
            }
            if ((i & 2) != 0) {
                ravenType = billingScreen.ravenType;
            }
            return billingScreen.copy(pvgVar, ravenType);
        }

        public static final /* synthetic */ void write$Self$settings(BillingScreen self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.subscriptionLevel);
            output.B(serialDesc, 1, w1e.d, self.ravenType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final pvg getSubscriptionLevel() {
            return this.subscriptionLevel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final RavenType getRavenType() {
            return this.ravenType;
        }

        public final BillingScreen copy(pvg subscriptionLevel, RavenType ravenType) {
            subscriptionLevel.getClass();
            return new BillingScreen(subscriptionLevel, ravenType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingScreen)) {
                return false;
            }
            BillingScreen billingScreen = (BillingScreen) other;
            return this.subscriptionLevel == billingScreen.subscriptionLevel && this.ravenType == billingScreen.ravenType;
        }

        @Override // com.anthropic.claude.settings.SettingsAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final RavenType getRavenType() {
            return this.ravenType;
        }

        public final pvg getSubscriptionLevel() {
            return this.subscriptionLevel;
        }

        public int hashCode() {
            int iHashCode = this.subscriptionLevel.hashCode() * 31;
            RavenType ravenType = this.ravenType;
            return iHashCode + (ravenType == null ? 0 : ravenType.hashCode());
        }

        public String toString() {
            return "BillingScreen(subscriptionLevel=" + this.subscriptionLevel + ", ravenType=" + this.ravenType + ")";
        }

        public BillingScreen(pvg pvgVar, RavenType ravenType) {
            pvgVar.getClass();
            this.subscriptionLevel = pvgVar;
            this.ravenType = ravenType;
        }
    }
}
