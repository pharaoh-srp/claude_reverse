package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i9e {
    public static final LinkedHashMap a;

    static {
        kce kceVar = jce.a;
        Set<Map.Entry> setEntrySet = sta.h0(new cpc("ActiveCaloriesBurned", kceVar.b(zb.class)), new cpc("ActivitySession", kceVar.b(n67.class)), new cpc("BasalBodyTemperature", kceVar.b(cd1.class)), new cpc("BasalMetabolicRate", kceVar.b(ed1.class)), new cpc("BloodGlucose", kceVar.b(rs1.class)), new cpc("BloodPressure", kceVar.b(ys1.class)), new cpc("BodyFat", kceVar.b(ht1.class)), new cpc("BodyTemperature", kceVar.b(kt1.class)), new cpc("BodyWaterMass", kceVar.b(mt1.class)), new cpc("BoneMass", kceVar.b(ot1.class)), new cpc("CervicalMucus", kceVar.b(lg2.class)), new cpc("CyclingPedalingCadenceSeries", kceVar.b(te5.class)), new cpc("Distance", kceVar.b(d96.class)), new cpc("ElevationGained", kceVar.b(kk6.class)), new cpc("FloorsClimbed", kceVar.b(jp7.class)), new cpc("HeartRateSeries", kceVar.b(xl8.class)), new cpc("HeartRateVariabilityRmssd", kceVar.b(zl8.class)), new cpc("Height", kceVar.b(lm8.class)), new cpc("Hydration", kceVar.b(dt8.class)), new cpc("LeanBodyMass", kceVar.b(c2a.class)), new cpc("Menstruation", kceVar.b(pcb.class)), new cpc("MenstruationPeriod", kceVar.b(rcb.class)), new cpc("MindfulnessSession", kceVar.b(okb.class)), new cpc("Nutrition", kceVar.b(qac.class)), new cpc("OvulationTest", kceVar.b(lmc.class)), new cpc("OxygenSaturation", kceVar.b(qmc.class)), new cpc("PowerSeries", kceVar.b(mad.class)), new cpc("RespiratoryRate", kceVar.b(mqe.class)), new cpc("RestingHeartRate", kceVar.b(cre.class)), new cpc("SexualActivity", kceVar.b(qzf.class)), new cpc("SkinTemperature", kceVar.b(f9g.class)), new cpc("SleepSession", kceVar.b(r9g.class)), new cpc("SpeedSeries", kceVar.b(dig.class)), new cpc("IntermenstrualBleeding", kceVar.b(j89.class)), new cpc("Steps", kceVar.b(ong.class)), new cpc("StepsCadenceSeries", kceVar.b(mng.class)), new cpc("TotalCaloriesBurned", kceVar.b(c3i.class)), new cpc("Vo2Max", kceVar.b(r0j.class)), new cpc("WheelchairPushes", kceVar.b(u9j.class)), new cpc("Weight", kceVar.b(g9j.class))).entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        a = linkedHashMap;
    }
}
