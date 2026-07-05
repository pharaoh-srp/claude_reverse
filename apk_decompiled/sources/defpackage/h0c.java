package defpackage;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseCompletionGoal;
import android.health.connect.datatypes.ExerciseLap;
import android.health.connect.datatypes.ExercisePerformanceGoal;
import android.health.connect.datatypes.ExerciseRoute;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PlannedExerciseBlock;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.PlannedExerciseStep;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import android.health.connect.datatypes.units.BloodGlucose;
import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Percentage;
import android.health.connect.datatypes.units.Power;
import android.health.connect.datatypes.units.Pressure;
import android.health.connect.datatypes.units.Temperature;
import android.health.connect.datatypes.units.TemperatureDelta;
import android.health.connect.datatypes.units.Velocity;
import android.health.connect.datatypes.units.Volume;
import androidx.core.widget.NestedScrollView;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0c {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static final NutritionRecord b(qac qacVar) {
        t8e.l();
        NutritionRecord.Builder builderC = t8e.c(yrk.n(qacVar.e), qacVar.a, qacVar.c);
        Integer num = (Integer) r69.g.get(Integer.valueOf(qacVar.W));
        NutritionRecord.Builder mealType = builderC.setMealType(num != null ? num.intValue() : 0);
        ZoneOffset zoneOffset = qacVar.b;
        if (zoneOffset != null) {
            mealType.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = qacVar.d;
        if (zoneOffset2 != null) {
            mealType.setEndZoneOffset(zoneOffset2);
        }
        fva fvaVar = qacVar.f;
        if (fvaVar != null) {
            mealType.setBiotin(ac1.n(fvaVar));
        }
        fva fvaVar2 = qacVar.g;
        if (fvaVar2 != null) {
            mealType.setCaffeine(ac1.n(fvaVar2));
        }
        fva fvaVar3 = qacVar.h;
        if (fvaVar3 != null) {
            mealType.setCalcium(ac1.n(fvaVar3));
        }
        fva fvaVar4 = qacVar.k;
        if (fvaVar4 != null) {
            mealType.setChloride(ac1.n(fvaVar4));
        }
        fva fvaVar5 = qacVar.l;
        if (fvaVar5 != null) {
            mealType.setCholesterol(ac1.n(fvaVar5));
        }
        fva fvaVar6 = qacVar.m;
        if (fvaVar6 != null) {
            mealType.setChromium(ac1.n(fvaVar6));
        }
        fva fvaVar7 = qacVar.n;
        if (fvaVar7 != null) {
            mealType.setCopper(ac1.n(fvaVar7));
        }
        fva fvaVar8 = qacVar.o;
        if (fvaVar8 != null) {
            mealType.setDietaryFiber(ac1.n(fvaVar8));
        }
        yn6 yn6Var = qacVar.i;
        if (yn6Var != null) {
            mealType.setEnergy(ac1.l(yn6Var));
        }
        yn6 yn6Var2 = qacVar.j;
        if (yn6Var2 != null) {
            mealType.setEnergyFromFat(ac1.l(yn6Var2));
        }
        fva fvaVar9 = qacVar.p;
        if (fvaVar9 != null) {
            mealType.setFolate(ac1.n(fvaVar9));
        }
        fva fvaVar10 = qacVar.q;
        if (fvaVar10 != null) {
            mealType.setFolicAcid(ac1.n(fvaVar10));
        }
        fva fvaVar11 = qacVar.r;
        if (fvaVar11 != null) {
            mealType.setIodine(ac1.n(fvaVar11));
        }
        fva fvaVar12 = qacVar.s;
        if (fvaVar12 != null) {
            mealType.setIron(ac1.n(fvaVar12));
        }
        fva fvaVar13 = qacVar.t;
        if (fvaVar13 != null) {
            mealType.setMagnesium(ac1.n(fvaVar13));
        }
        fva fvaVar14 = qacVar.u;
        if (fvaVar14 != null) {
            mealType.setManganese(ac1.n(fvaVar14));
        }
        fva fvaVar15 = qacVar.v;
        if (fvaVar15 != null) {
            mealType.setMolybdenum(ac1.n(fvaVar15));
        }
        fva fvaVar16 = qacVar.w;
        if (fvaVar16 != null) {
            mealType.setMonounsaturatedFat(ac1.n(fvaVar16));
        }
        String str = qacVar.V;
        if (str != null) {
            mealType.setMealName(str);
        }
        fva fvaVar17 = qacVar.x;
        if (fvaVar17 != null) {
            mealType.setNiacin(ac1.n(fvaVar17));
        }
        fva fvaVar18 = qacVar.y;
        if (fvaVar18 != null) {
            mealType.setPantothenicAcid(ac1.n(fvaVar18));
        }
        fva fvaVar19 = qacVar.z;
        if (fvaVar19 != null) {
            mealType.setPhosphorus(ac1.n(fvaVar19));
        }
        fva fvaVar20 = qacVar.A;
        if (fvaVar20 != null) {
            mealType.setPolyunsaturatedFat(ac1.n(fvaVar20));
        }
        fva fvaVar21 = qacVar.B;
        if (fvaVar21 != null) {
            mealType.setPotassium(ac1.n(fvaVar21));
        }
        fva fvaVar22 = qacVar.C;
        if (fvaVar22 != null) {
            mealType.setProtein(ac1.n(fvaVar22));
        }
        fva fvaVar23 = qacVar.D;
        if (fvaVar23 != null) {
            mealType.setRiboflavin(ac1.n(fvaVar23));
        }
        fva fvaVar24 = qacVar.E;
        if (fvaVar24 != null) {
            mealType.setSaturatedFat(ac1.n(fvaVar24));
        }
        fva fvaVar25 = qacVar.F;
        if (fvaVar25 != null) {
            mealType.setSelenium(ac1.n(fvaVar25));
        }
        fva fvaVar26 = qacVar.G;
        if (fvaVar26 != null) {
            mealType.setSodium(ac1.n(fvaVar26));
        }
        fva fvaVar27 = qacVar.H;
        if (fvaVar27 != null) {
            mealType.setSugar(ac1.n(fvaVar27));
        }
        fva fvaVar28 = qacVar.I;
        if (fvaVar28 != null) {
            mealType.setThiamin(ac1.n(fvaVar28));
        }
        fva fvaVar29 = qacVar.J;
        if (fvaVar29 != null) {
            mealType.setTotalCarbohydrate(ac1.n(fvaVar29));
        }
        fva fvaVar30 = qacVar.K;
        if (fvaVar30 != null) {
            mealType.setTotalFat(ac1.n(fvaVar30));
        }
        fva fvaVar31 = qacVar.L;
        if (fvaVar31 != null) {
            mealType.setTransFat(ac1.n(fvaVar31));
        }
        fva fvaVar32 = qacVar.M;
        if (fvaVar32 != null) {
            mealType.setUnsaturatedFat(ac1.n(fvaVar32));
        }
        fva fvaVar33 = qacVar.N;
        if (fvaVar33 != null) {
            mealType.setVitaminA(ac1.n(fvaVar33));
        }
        fva fvaVar34 = qacVar.P;
        if (fvaVar34 != null) {
            mealType.setVitaminB6(ac1.n(fvaVar34));
        }
        fva fvaVar35 = qacVar.O;
        if (fvaVar35 != null) {
            mealType.setVitaminB12(ac1.n(fvaVar35));
        }
        fva fvaVar36 = qacVar.Q;
        if (fvaVar36 != null) {
            mealType.setVitaminC(ac1.n(fvaVar36));
        }
        fva fvaVar37 = qacVar.R;
        if (fvaVar37 != null) {
            mealType.setVitaminD(ac1.n(fvaVar37));
        }
        fva fvaVar38 = qacVar.S;
        if (fvaVar38 != null) {
            mealType.setVitaminE(ac1.n(fvaVar38));
        }
        fva fvaVar39 = qacVar.T;
        if (fvaVar39 != null) {
            mealType.setVitaminK(ac1.n(fvaVar39));
        }
        fva fvaVar40 = qacVar.U;
        if (fvaVar40 != null) {
            mealType.setZinc(ac1.n(fvaVar40));
        }
        NutritionRecord nutritionRecordBuild = mealType.build();
        nutritionRecordBuild.getClass();
        return nutritionRecordBuild;
    }

    public static final void c(y7e y7eVar) {
        MindfulnessSessionRecord mindfulnessSessionRecordBuild;
        int iIntValue;
        ExerciseCompletionGoal.DistanceGoal activeCaloriesBurnedGoal;
        Iterator it;
        ExercisePerformanceGoal.PowerGoal rateOfPerceivedExertionGoal;
        y7eVar.getClass();
        PlannedExerciseSessionRecord plannedExerciseSessionRecordBuild = null;
        if (quj.h() && (y7eVar instanceof okb)) {
            okb okbVar = (okb) y7eVar;
            pzb.m();
            Metadata metadataN = yrk.n(okbVar.e);
            Instant instant = okbVar.a;
            Instant instant2 = okbVar.c;
            Integer num = (Integer) r69.H.get(Integer.valueOf(okbVar.f));
            MindfulnessSessionRecord.Builder builderE = pzb.e(metadataN, instant, instant2, num != null ? num.intValue() : 0);
            ZoneOffset zoneOffset = okbVar.b;
            if (zoneOffset != null) {
                builderE.setStartZoneOffset(zoneOffset);
            }
            ZoneOffset zoneOffset2 = okbVar.d;
            if (zoneOffset2 != null) {
                builderE.setEndZoneOffset(zoneOffset2);
            }
            String str = okbVar.g;
            if (str != null) {
                builderE.setTitle(str);
            }
            String str2 = okbVar.h;
            if (str2 != null) {
                builderE.setNotes(str2);
            }
            mindfulnessSessionRecordBuild = builderE.build();
            mindfulnessSessionRecordBuild.getClass();
        } else {
            mindfulnessSessionRecordBuild = null;
        }
        if (mindfulnessSessionRecordBuild == null) {
            int i = 10;
            if (quj.g()) {
                if (y7eVar instanceof p4d) {
                    p4d p4dVar = (p4d) y7eVar;
                    boolean z = p4dVar.f;
                    ZoneOffset zoneOffset3 = p4dVar.b;
                    Instant instant3 = p4dVar.c;
                    int i2 = p4dVar.g;
                    ijb ijbVar = p4dVar.e;
                    Instant instant4 = p4dVar.a;
                    PlannedExerciseSessionRecord.Builder builder = z ? new PlannedExerciseSessionRecord.Builder(yrk.n(ijbVar), r69.b(i2), instant4, instant3) : new PlannedExerciseSessionRecord.Builder(yrk.n(ijbVar), r69.b(i2), instant4.atZone(zoneOffset3).toLocalDate(), Duration.between(instant4, instant3));
                    if (zoneOffset3 != null) {
                        builder.setStartZoneOffset(zoneOffset3);
                    }
                    ZoneOffset zoneOffset4 = p4dVar.d;
                    if (zoneOffset4 != null) {
                        builder.setEndZoneOffset(zoneOffset4);
                    }
                    String str3 = p4dVar.j;
                    if (str3 != null) {
                        builder.setTitle(str3);
                    }
                    String str4 = p4dVar.k;
                    if (str4 != null) {
                        builder.setNotes(str4);
                    }
                    ArrayList<n4d> arrayList = p4dVar.i;
                    ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                    for (n4d n4dVar : arrayList) {
                        PlannedExerciseBlock.Builder builder2 = new PlannedExerciseBlock.Builder(n4dVar.a);
                        builder2.setDescription(n4dVar.c);
                        ArrayList arrayList3 = n4dVar.b;
                        ArrayList arrayList4 = new ArrayList(x44.y(arrayList3, i));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            q4d q4dVar = (q4d) it2.next();
                            Integer num2 = (Integer) r69.F.get(Integer.valueOf(q4dVar.a));
                            int iIntValue2 = num2 != null ? num2.intValue() : 0;
                            Integer num3 = (Integer) r69.y.get(Integer.valueOf(q4dVar.b));
                            int iIntValue3 = num3 != null ? num3.intValue() : 0;
                            hjk hjkVar = q4dVar.c;
                            if (hjkVar instanceof o57) {
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.DistanceGoal(ac1.m(((o57) hjkVar).c));
                            } else if (hjkVar instanceof n57) {
                                n57 n57Var = (n57) hjkVar;
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.DistanceWithVariableRestGoal(ac1.m(n57Var.c), n57Var.d);
                            } else if (hjkVar instanceof s57) {
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.StepsGoal(((s57) hjkVar).c);
                            } else if (hjkVar instanceof p57) {
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.DurationGoal(((p57) hjkVar).c);
                            } else if (hjkVar instanceof r57) {
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.RepetitionsGoal(((r57) hjkVar).c);
                            } else if (hjkVar instanceof t57) {
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.TotalCaloriesBurnedGoal(ac1.l(((t57) hjkVar).c));
                            } else if (hjkVar instanceof m57) {
                                activeCaloriesBurnedGoal = new ExerciseCompletionGoal.ActiveCaloriesBurnedGoal(ac1.l(((m57) hjkVar).c));
                            } else if (hjkVar instanceof u57) {
                                activeCaloriesBurnedGoal = ExerciseCompletionGoal.UnknownGoal.INSTANCE;
                                activeCaloriesBurnedGoal.getClass();
                            } else if (!(hjkVar instanceof q57)) {
                                xh6.k("Unsupported exercise completion goal ", hjkVar);
                                return;
                            } else {
                                activeCaloriesBurnedGoal = ExerciseCompletionGoal.UnspecifiedGoal.INSTANCE;
                                activeCaloriesBurnedGoal.getClass();
                            }
                            PlannedExerciseStep.Builder builder3 = new PlannedExerciseStep.Builder(iIntValue2, iIntValue3, activeCaloriesBurnedGoal);
                            builder3.setDescription(q4dVar.e);
                            ArrayList<e67> arrayList5 = q4dVar.d;
                            ArrayList arrayList6 = new ArrayList(x44.y(arrayList5, i));
                            for (e67 e67Var : arrayList5) {
                                e67Var.getClass();
                                if (e67Var instanceof z57) {
                                    z57 z57Var = (z57) e67Var;
                                    Power powerFromWatts = Power.fromWatts(z57Var.a.a());
                                    powerFromWatts.getClass();
                                    Power powerFromWatts2 = Power.fromWatts(z57Var.b.a());
                                    powerFromWatts2.getClass();
                                    rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.PowerGoal(powerFromWatts, powerFromWatts2);
                                } else if (e67Var instanceof b67) {
                                    b67 b67Var = (b67) e67Var;
                                    Velocity velocityFromMetersPerSecond = Velocity.fromMetersPerSecond(b67Var.a.a());
                                    velocityFromMetersPerSecond.getClass();
                                    Velocity velocityFromMetersPerSecond2 = Velocity.fromMetersPerSecond(b67Var.b.a());
                                    velocityFromMetersPerSecond2.getClass();
                                    rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.SpeedGoal(velocityFromMetersPerSecond, velocityFromMetersPerSecond2);
                                } else {
                                    if (e67Var instanceof x57) {
                                        x57 x57Var = (x57) e67Var;
                                        it = it2;
                                        rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.CadenceGoal(x57Var.a, x57Var.b);
                                    } else {
                                        it = it2;
                                        if (e67Var instanceof y57) {
                                            y57 y57Var = (y57) e67Var;
                                            rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.HeartRateGoal(mwa.K(y57Var.a), mwa.K(y57Var.b));
                                        } else if (e67Var instanceof d67) {
                                            rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.WeightGoal(ac1.n(((d67) e67Var).a));
                                        } else if (e67Var instanceof a67) {
                                            rateOfPerceivedExertionGoal = new ExercisePerformanceGoal.RateOfPerceivedExertionGoal(((a67) e67Var).a);
                                        } else if (e67Var instanceof w57) {
                                            rateOfPerceivedExertionGoal = ExercisePerformanceGoal.AmrapGoal.INSTANCE;
                                            rateOfPerceivedExertionGoal.getClass();
                                        } else if (!(e67Var instanceof c67)) {
                                            xh6.k("Unsupported exercise performance target ", e67Var);
                                            return;
                                        } else {
                                            rateOfPerceivedExertionGoal = ExercisePerformanceGoal.UnknownGoal.INSTANCE;
                                            rateOfPerceivedExertionGoal.getClass();
                                        }
                                    }
                                    arrayList6.add(rateOfPerceivedExertionGoal);
                                    it2 = it;
                                }
                                it = it2;
                                arrayList6.add(rateOfPerceivedExertionGoal);
                                it2 = it;
                            }
                            builder3.setPerformanceGoals(arrayList6);
                            PlannedExerciseStep plannedExerciseStepBuild = builder3.build();
                            plannedExerciseStepBuild.getClass();
                            arrayList4.add(plannedExerciseStepBuild);
                            i = 10;
                        }
                        builder2.setSteps(arrayList4);
                        PlannedExerciseBlock plannedExerciseBlockBuild = builder2.build();
                        plannedExerciseBlockBuild.getClass();
                        arrayList2.add(plannedExerciseBlockBuild);
                        i = 10;
                    }
                    builder.setBlocks(arrayList2);
                    plannedExerciseSessionRecordBuild = builder.build();
                    plannedExerciseSessionRecordBuild.getClass();
                } else if (y7eVar instanceof f9g) {
                    f9g f9gVar = (f9g) y7eVar;
                    SkinTemperatureRecord.Builder builder4 = new SkinTemperatureRecord.Builder(yrk.n(f9gVar.e), f9gVar.a, f9gVar.c);
                    ZoneOffset zoneOffset5 = f9gVar.b;
                    if (zoneOffset5 != null) {
                        builder4.setStartZoneOffset(zoneOffset5);
                    }
                    ZoneOffset zoneOffset6 = f9gVar.d;
                    if (zoneOffset6 != null) {
                        builder4.setEndZoneOffset(zoneOffset6);
                    }
                    sch schVar = f9gVar.g;
                    if (schVar != null) {
                        Temperature temperatureFromCelsius = Temperature.fromCelsius(schVar.E);
                        temperatureFromCelsius.getClass();
                        builder4.setBaseline(temperatureFromCelsius);
                    }
                    Integer num4 = (Integer) r69.w.get(Integer.valueOf(f9gVar.h));
                    builder4.setMeasurementLocation(num4 != null ? num4.intValue() : 0);
                    List<e9g> list = f9gVar.f;
                    ArrayList arrayList7 = new ArrayList(x44.y(list, 10));
                    for (e9g e9gVar : list) {
                        TemperatureDelta temperatureDeltaFromCelsius = TemperatureDelta.fromCelsius(e9gVar.b.E);
                        temperatureDeltaFromCelsius.getClass();
                        arrayList7.add(new SkinTemperatureRecord.Delta(temperatureDeltaFromCelsius, e9gVar.a));
                    }
                    builder4.setDeltas(arrayList7);
                    plannedExerciseSessionRecordBuild = builder4.build();
                    plannedExerciseSessionRecordBuild.getClass();
                }
            }
            if (plannedExerciseSessionRecordBuild == null) {
                if (y7eVar instanceof zb) {
                    zb zbVar = (zb) y7eVar;
                    ActiveCaloriesBurnedRecord.Builder builder5 = new ActiveCaloriesBurnedRecord.Builder(yrk.n(zbVar.f), zbVar.a, zbVar.c, ac1.l(zbVar.e));
                    ZoneOffset zoneOffset7 = zbVar.b;
                    if (zoneOffset7 != null) {
                        builder5.setStartZoneOffset(zoneOffset7);
                    }
                    ZoneOffset zoneOffset8 = zbVar.d;
                    if (zoneOffset8 != null) {
                        builder5.setEndZoneOffset(zoneOffset8);
                    }
                    builder5.build().getClass();
                    return;
                }
                if (y7eVar instanceof cd1) {
                    cd1 cd1Var = (cd1) y7eVar;
                    Metadata metadataN2 = yrk.n(cd1Var.c);
                    Instant instant5 = cd1Var.a;
                    Integer num5 = (Integer) r69.m.get(Integer.valueOf(cd1Var.e));
                    iIntValue = num5 != null ? num5.intValue() : 0;
                    Temperature temperatureFromCelsius2 = Temperature.fromCelsius(cd1Var.d.E);
                    temperatureFromCelsius2.getClass();
                    BasalBodyTemperatureRecord.Builder builder6 = new BasalBodyTemperatureRecord.Builder(metadataN2, instant5, iIntValue, temperatureFromCelsius2);
                    ZoneOffset zoneOffset9 = cd1Var.b;
                    if (zoneOffset9 != null) {
                        builder6.setZoneOffset(zoneOffset9);
                    }
                    builder6.build().getClass();
                    return;
                }
                if (y7eVar instanceof ed1) {
                    ed1 ed1Var = (ed1) y7eVar;
                    BasalMetabolicRateRecord.Builder builder7 = new BasalMetabolicRateRecord.Builder(yrk.n(ed1Var.d), ed1Var.a, ac1.o(ed1Var.c));
                    ZoneOffset zoneOffset10 = ed1Var.b;
                    if (zoneOffset10 != null) {
                        builder7.setZoneOffset(zoneOffset10);
                    }
                    builder7.build().getClass();
                    return;
                }
                if (y7eVar instanceof rs1) {
                    rs1 rs1Var = (rs1) y7eVar;
                    Metadata metadataN3 = yrk.n(rs1Var.c);
                    Instant instant6 = rs1Var.a;
                    Integer num6 = (Integer) r69.y.get(Integer.valueOf(rs1Var.e));
                    int iIntValue4 = num6 != null ? num6.intValue() : 0;
                    BloodGlucose bloodGlucoseFromMillimolesPerLiter = BloodGlucose.fromMillimolesPerLiter(rs1Var.d.a());
                    bloodGlucoseFromMillimolesPerLiter.getClass();
                    Integer num7 = (Integer) r69.A.get(Integer.valueOf(rs1Var.g));
                    int iIntValue5 = num7 != null ? num7.intValue() : 0;
                    Integer num8 = (Integer) r69.g.get(Integer.valueOf(rs1Var.f));
                    BloodGlucoseRecord.Builder builder8 = new BloodGlucoseRecord.Builder(metadataN3, instant6, iIntValue4, bloodGlucoseFromMillimolesPerLiter, iIntValue5, num8 != null ? num8.intValue() : 0);
                    ZoneOffset zoneOffset11 = rs1Var.b;
                    if (zoneOffset11 != null) {
                        builder8.setZoneOffset(zoneOffset11);
                    }
                    builder8.build().getClass();
                    return;
                }
                if (y7eVar instanceof ys1) {
                    ys1 ys1Var = (ys1) y7eVar;
                    Metadata metadataN4 = yrk.n(ys1Var.c);
                    Instant instant7 = ys1Var.a;
                    Integer num9 = (Integer) r69.o.get(Integer.valueOf(ys1Var.g));
                    int iIntValue6 = num9 != null ? num9.intValue() : 0;
                    Pressure pressureFromMillimetersOfMercury = Pressure.fromMillimetersOfMercury(ys1Var.d.E);
                    pressureFromMillimetersOfMercury.getClass();
                    Pressure pressureFromMillimetersOfMercury2 = Pressure.fromMillimetersOfMercury(ys1Var.e.E);
                    pressureFromMillimetersOfMercury2.getClass();
                    Integer num10 = (Integer) r69.c.get(Integer.valueOf(ys1Var.f));
                    BloodPressureRecord.Builder builder9 = new BloodPressureRecord.Builder(metadataN4, instant7, iIntValue6, pressureFromMillimetersOfMercury, pressureFromMillimetersOfMercury2, num10 != null ? num10.intValue() : 0);
                    ZoneOffset zoneOffset12 = ys1Var.b;
                    if (zoneOffset12 != null) {
                        builder9.setZoneOffset(zoneOffset12);
                    }
                    builder9.build().getClass();
                    return;
                }
                if (y7eVar instanceof ht1) {
                    ht1 ht1Var = (ht1) y7eVar;
                    Metadata metadataN5 = yrk.n(ht1Var.d);
                    Instant instant8 = ht1Var.a;
                    Percentage percentageFromValue = Percentage.fromValue(ht1Var.c.E);
                    percentageFromValue.getClass();
                    BodyFatRecord.Builder builder10 = new BodyFatRecord.Builder(metadataN5, instant8, percentageFromValue);
                    ZoneOffset zoneOffset13 = ht1Var.b;
                    if (zoneOffset13 != null) {
                        builder10.setZoneOffset(zoneOffset13);
                    }
                    builder10.build().getClass();
                    return;
                }
                if (y7eVar instanceof kt1) {
                    kt1 kt1Var = (kt1) y7eVar;
                    Metadata metadataN6 = yrk.n(kt1Var.c);
                    Instant instant9 = kt1Var.a;
                    Integer num11 = (Integer) r69.m.get(Integer.valueOf(kt1Var.e));
                    iIntValue = num11 != null ? num11.intValue() : 0;
                    Temperature temperatureFromCelsius3 = Temperature.fromCelsius(kt1Var.d.E);
                    temperatureFromCelsius3.getClass();
                    BodyTemperatureRecord.Builder builder11 = new BodyTemperatureRecord.Builder(metadataN6, instant9, iIntValue, temperatureFromCelsius3);
                    ZoneOffset zoneOffset14 = kt1Var.b;
                    if (zoneOffset14 != null) {
                        builder11.setZoneOffset(zoneOffset14);
                    }
                    builder11.build().getClass();
                    return;
                }
                if (y7eVar instanceof mt1) {
                    mt1 mt1Var = (mt1) y7eVar;
                    BodyWaterMassRecord.Builder builder12 = new BodyWaterMassRecord.Builder(yrk.n(mt1Var.d), mt1Var.a, ac1.n(mt1Var.c));
                    ZoneOffset zoneOffset15 = mt1Var.b;
                    if (zoneOffset15 != null) {
                        builder12.setZoneOffset(zoneOffset15);
                    }
                    builder12.build().getClass();
                    return;
                }
                if (y7eVar instanceof ot1) {
                    ot1 ot1Var = (ot1) y7eVar;
                    BoneMassRecord.Builder builder13 = new BoneMassRecord.Builder(yrk.n(ot1Var.d), ot1Var.a, ac1.n(ot1Var.c));
                    ZoneOffset zoneOffset16 = ot1Var.b;
                    if (zoneOffset16 != null) {
                        builder13.setZoneOffset(zoneOffset16);
                    }
                    builder13.build().getClass();
                    return;
                }
                if (y7eVar instanceof lg2) {
                    lg2 lg2Var = (lg2) y7eVar;
                    Metadata metadataN7 = yrk.n(lg2Var.c);
                    Instant instant10 = lg2Var.a;
                    Integer num12 = (Integer) r69.s.get(Integer.valueOf(lg2Var.e));
                    int iIntValue7 = num12 != null ? num12.intValue() : 0;
                    Integer num13 = (Integer) r69.a.get(Integer.valueOf(lg2Var.d));
                    CervicalMucusRecord.Builder builder14 = new CervicalMucusRecord.Builder(metadataN7, instant10, iIntValue7, num13 != null ? num13.intValue() : 0);
                    ZoneOffset zoneOffset17 = lg2Var.b;
                    if (zoneOffset17 != null) {
                        builder14.setZoneOffset(zoneOffset17);
                    }
                    builder14.build().getClass();
                    return;
                }
                if (y7eVar instanceof te5) {
                    te5 te5Var = (te5) y7eVar;
                    Metadata metadataN8 = yrk.n(te5Var.f);
                    Instant instant11 = te5Var.a;
                    Instant instant12 = te5Var.c;
                    List<se5> list2 = te5Var.e;
                    ArrayList arrayList8 = new ArrayList(x44.y(list2, 10));
                    for (se5 se5Var : list2) {
                        arrayList8.add(new CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(se5Var.b, se5Var.a));
                    }
                    CyclingPedalingCadenceRecord.Builder builder15 = new CyclingPedalingCadenceRecord.Builder(metadataN8, instant11, instant12, arrayList8);
                    ZoneOffset zoneOffset18 = te5Var.b;
                    if (zoneOffset18 != null) {
                        builder15.setStartZoneOffset(zoneOffset18);
                    }
                    ZoneOffset zoneOffset19 = te5Var.d;
                    if (zoneOffset19 != null) {
                        builder15.setEndZoneOffset(zoneOffset19);
                    }
                    builder15.build().getClass();
                    return;
                }
                if (y7eVar instanceof d96) {
                    d96 d96Var = (d96) y7eVar;
                    DistanceRecord.Builder builder16 = new DistanceRecord.Builder(yrk.n(d96Var.f), d96Var.a, d96Var.c, ac1.m(d96Var.e));
                    ZoneOffset zoneOffset20 = d96Var.b;
                    if (zoneOffset20 != null) {
                        builder16.setStartZoneOffset(zoneOffset20);
                    }
                    ZoneOffset zoneOffset21 = d96Var.d;
                    if (zoneOffset21 != null) {
                        builder16.setEndZoneOffset(zoneOffset21);
                    }
                    builder16.build().getClass();
                    return;
                }
                if (y7eVar instanceof kk6) {
                    kk6 kk6Var = (kk6) y7eVar;
                    ElevationGainedRecord.Builder builder17 = new ElevationGainedRecord.Builder(yrk.n(kk6Var.f), kk6Var.a, kk6Var.c, ac1.m(kk6Var.e));
                    ZoneOffset zoneOffset22 = kk6Var.b;
                    if (zoneOffset22 != null) {
                        builder17.setStartZoneOffset(zoneOffset22);
                    }
                    ZoneOffset zoneOffset23 = kk6Var.d;
                    if (zoneOffset23 != null) {
                        builder17.setEndZoneOffset(zoneOffset23);
                    }
                    builder17.build().getClass();
                    return;
                }
                if (y7eVar instanceof n67) {
                    n67 n67Var = (n67) y7eVar;
                    ExerciseSessionRecord.Builder builder18 = new ExerciseSessionRecord.Builder(yrk.n(n67Var.e), n67Var.a, n67Var.c, r69.b(n67Var.f));
                    ZoneOffset zoneOffset24 = n67Var.b;
                    if (zoneOffset24 != null) {
                        builder18.setStartZoneOffset(zoneOffset24);
                    }
                    ZoneOffset zoneOffset25 = n67Var.d;
                    if (zoneOffset25 != null) {
                        builder18.setEndZoneOffset(zoneOffset25);
                    }
                    String str5 = n67Var.h;
                    if (str5 != null) {
                        builder18.setNotes(str5);
                    }
                    String str6 = n67Var.g;
                    if (str6 != null) {
                        builder18.setTitle(str6);
                    }
                    List<v57> list3 = n67Var.j;
                    ArrayList arrayList9 = new ArrayList(x44.y(list3, 10));
                    for (v57 v57Var : list3) {
                        ExerciseLap.Builder builder19 = new ExerciseLap.Builder(v57Var.a, v57Var.b);
                        f3a f3aVar = v57Var.c;
                        if (f3aVar != null) {
                            builder19.setLength(ac1.m(f3aVar));
                        }
                        ExerciseLap exerciseLapBuild = builder19.build();
                        exerciseLapBuild.getClass();
                        arrayList9.add(exerciseLapBuild);
                    }
                    builder18.setLaps(arrayList9);
                    List<l67> list4 = n67Var.i;
                    ArrayList arrayList10 = new ArrayList(x44.y(list4, 10));
                    for (l67 l67Var : list4) {
                        Instant instant13 = l67Var.a;
                        Instant instant14 = l67Var.b;
                        Integer num14 = (Integer) r69.F.get(Integer.valueOf(l67Var.c));
                        ExerciseSegment exerciseSegmentBuild = new ExerciseSegment.Builder(instant13, instant14, num14 != null ? num14.intValue() : 0).setRepetitionsCount(l67Var.d).build();
                        exerciseSegmentBuild.getClass();
                        arrayList10.add(exerciseSegmentBuild);
                    }
                    builder18.setSegments(arrayList10);
                    ijk ijkVar = n67Var.k;
                    if (ijkVar instanceof j67) {
                        ArrayList<f67> arrayList11 = ((j67) ijkVar).e.a;
                        ArrayList arrayList12 = new ArrayList(x44.y(arrayList11, 10));
                        for (f67 f67Var : arrayList11) {
                            ExerciseRoute.Location.Builder builder20 = new ExerciseRoute.Location.Builder(f67Var.a, f67Var.b, f67Var.c);
                            f3a f3aVar2 = f67Var.d;
                            if (f3aVar2 != null) {
                                builder20.setHorizontalAccuracy(ac1.m(f3aVar2));
                            }
                            f3a f3aVar3 = f67Var.e;
                            if (f3aVar3 != null) {
                                builder20.setVerticalAccuracy(ac1.m(f3aVar3));
                            }
                            f3a f3aVar4 = f67Var.f;
                            if (f3aVar4 != null) {
                                builder20.setAltitude(ac1.m(f3aVar4));
                            }
                            arrayList12.add(builder20.build());
                        }
                        builder18.setRoute(new ExerciseRoute(arrayList12));
                    }
                    String str7 = n67Var.l;
                    if (str7 != null) {
                        builder18.setPlannedExerciseSessionId(str7);
                    }
                    builder18.build().getClass();
                    return;
                }
                if (y7eVar instanceof jp7) {
                    jp7 jp7Var = (jp7) y7eVar;
                    FloorsClimbedRecord.Builder builder21 = new FloorsClimbedRecord.Builder(yrk.n(jp7Var.f), jp7Var.a, jp7Var.c, jp7Var.e);
                    ZoneOffset zoneOffset26 = jp7Var.b;
                    if (zoneOffset26 != null) {
                        builder21.setStartZoneOffset(zoneOffset26);
                    }
                    ZoneOffset zoneOffset27 = jp7Var.d;
                    if (zoneOffset27 != null) {
                        builder21.setEndZoneOffset(zoneOffset27);
                    }
                    builder21.build().getClass();
                    return;
                }
                if (y7eVar instanceof xl8) {
                    xl8 xl8Var = (xl8) y7eVar;
                    Metadata metadataN9 = yrk.n(xl8Var.f);
                    Instant instant15 = xl8Var.a;
                    Instant instant16 = xl8Var.c;
                    List<wl8> list5 = xl8Var.e;
                    ArrayList arrayList13 = new ArrayList(x44.y(list5, 10));
                    for (wl8 wl8Var : list5) {
                        arrayList13.add(new HeartRateRecord.HeartRateSample(wl8Var.b, wl8Var.a));
                    }
                    HeartRateRecord.Builder builder22 = new HeartRateRecord.Builder(metadataN9, instant15, instant16, arrayList13);
                    ZoneOffset zoneOffset28 = xl8Var.b;
                    if (zoneOffset28 != null) {
                        builder22.setStartZoneOffset(zoneOffset28);
                    }
                    ZoneOffset zoneOffset29 = xl8Var.d;
                    if (zoneOffset29 != null) {
                        builder22.setEndZoneOffset(zoneOffset29);
                    }
                    builder22.build().getClass();
                    return;
                }
                if (y7eVar instanceof zl8) {
                    zl8 zl8Var = (zl8) y7eVar;
                    HeartRateVariabilityRmssdRecord.Builder builder23 = new HeartRateVariabilityRmssdRecord.Builder(yrk.n(zl8Var.d), zl8Var.a, zl8Var.c);
                    ZoneOffset zoneOffset30 = zl8Var.b;
                    if (zoneOffset30 != null) {
                        builder23.setZoneOffset(zoneOffset30);
                    }
                    builder23.build().getClass();
                    return;
                }
                if (y7eVar instanceof lm8) {
                    lm8 lm8Var = (lm8) y7eVar;
                    HeightRecord.Builder builder24 = new HeightRecord.Builder(yrk.n(lm8Var.d), lm8Var.a, ac1.m(lm8Var.c));
                    ZoneOffset zoneOffset31 = lm8Var.b;
                    if (zoneOffset31 != null) {
                        builder24.setZoneOffset(zoneOffset31);
                    }
                    builder24.build().getClass();
                    return;
                }
                if (y7eVar instanceof dt8) {
                    dt8 dt8Var = (dt8) y7eVar;
                    Metadata metadataN10 = yrk.n(dt8Var.f);
                    Instant instant17 = dt8Var.a;
                    Instant instant18 = dt8Var.c;
                    Volume volumeFromLiters = Volume.fromLiters(dt8Var.e.a());
                    volumeFromLiters.getClass();
                    HydrationRecord.Builder builder25 = new HydrationRecord.Builder(metadataN10, instant17, instant18, volumeFromLiters);
                    ZoneOffset zoneOffset32 = dt8Var.b;
                    if (zoneOffset32 != null) {
                        builder25.setStartZoneOffset(zoneOffset32);
                    }
                    ZoneOffset zoneOffset33 = dt8Var.d;
                    if (zoneOffset33 != null) {
                        builder25.setEndZoneOffset(zoneOffset33);
                    }
                    builder25.build().getClass();
                    return;
                }
                if (y7eVar instanceof j89) {
                    j89 j89Var = (j89) y7eVar;
                    IntermenstrualBleedingRecord.Builder builderA = r8e.a(yrk.n(j89Var.c), j89Var.a);
                    ZoneOffset zoneOffset34 = j89Var.b;
                    if (zoneOffset34 != null) {
                        builderA.setZoneOffset(zoneOffset34);
                    }
                    builderA.build().getClass();
                    return;
                }
                if (y7eVar instanceof c2a) {
                    c2a c2aVar = (c2a) y7eVar;
                    u8e.e();
                    LeanBodyMassRecord.Builder builderA2 = t8e.a(yrk.n(c2aVar.d), c2aVar.a, ac1.n(c2aVar.c));
                    ZoneOffset zoneOffset35 = c2aVar.b;
                    if (zoneOffset35 != null) {
                        builderA2.setZoneOffset(zoneOffset35);
                    }
                    builderA2.build().getClass();
                    return;
                }
                if (y7eVar instanceof pcb) {
                    pcb pcbVar = (pcb) y7eVar;
                    t8e.j();
                    Metadata metadataN11 = yrk.n(pcbVar.c);
                    Instant instant19 = pcbVar.a;
                    Integer num15 = (Integer) r69.k.get(Integer.valueOf(pcbVar.d));
                    MenstruationFlowRecord.Builder builderB = t8e.b(metadataN11, instant19, num15 != null ? num15.intValue() : 0);
                    ZoneOffset zoneOffset36 = pcbVar.b;
                    if (zoneOffset36 != null) {
                        builderB.setZoneOffset(zoneOffset36);
                    }
                    builderB.build().getClass();
                    return;
                }
                if (y7eVar instanceof rcb) {
                    rcb rcbVar = (rcb) y7eVar;
                    r8e.l();
                    MenstruationPeriodRecord.Builder builderB2 = r8e.b(yrk.n(rcbVar.e), rcbVar.a, rcbVar.c);
                    ZoneOffset zoneOffset37 = rcbVar.b;
                    if (zoneOffset37 != null) {
                        builderB2.setStartZoneOffset(zoneOffset37);
                    }
                    ZoneOffset zoneOffset38 = rcbVar.d;
                    if (zoneOffset38 != null) {
                        builderB2.setEndZoneOffset(zoneOffset38);
                    }
                    builderB2.build().getClass();
                    return;
                }
                if (y7eVar instanceof qac) {
                    b((qac) y7eVar);
                    return;
                }
                if (y7eVar instanceof lmc) {
                    lmc lmcVar = (lmc) y7eVar;
                    t8e.q();
                    Metadata metadataN12 = yrk.n(lmcVar.d);
                    Instant instant20 = lmcVar.a;
                    Integer num16 = (Integer) r69.q.get(Integer.valueOf(lmcVar.c));
                    OvulationTestRecord.Builder builderD = t8e.d(metadataN12, instant20, num16 != null ? num16.intValue() : 0);
                    ZoneOffset zoneOffset39 = lmcVar.b;
                    if (zoneOffset39 != null) {
                        builderD.setZoneOffset(zoneOffset39);
                    }
                    builderD.build().getClass();
                    return;
                }
                if (y7eVar instanceof qmc) {
                    qmc qmcVar = (qmc) y7eVar;
                    t8e.s();
                    Metadata metadataN13 = yrk.n(qmcVar.d);
                    Instant instant21 = qmcVar.a;
                    Percentage percentageFromValue2 = Percentage.fromValue(qmcVar.c.E);
                    percentageFromValue2.getClass();
                    OxygenSaturationRecord.Builder builderE2 = t8e.e(metadataN13, instant21, percentageFromValue2);
                    ZoneOffset zoneOffset40 = qmcVar.b;
                    if (zoneOffset40 != null) {
                        builderE2.setZoneOffset(zoneOffset40);
                    }
                    builderE2.build().getClass();
                    return;
                }
                if (y7eVar instanceof mad) {
                    mad madVar = (mad) y7eVar;
                    Metadata metadataN14 = yrk.n(madVar.f);
                    Instant instant22 = madVar.a;
                    Instant instant23 = madVar.c;
                    List<lad> list6 = madVar.e;
                    ArrayList arrayList14 = new ArrayList(x44.y(list6, 10));
                    for (lad ladVar : list6) {
                        v8e.h();
                        arrayList14.add(v8e.c(ac1.o(ladVar.b), ladVar.a));
                    }
                    PowerRecord.Builder builderB3 = v8e.b(metadataN14, instant22, instant23, arrayList14);
                    ZoneOffset zoneOffset41 = madVar.b;
                    if (zoneOffset41 != null) {
                        builderB3.setStartZoneOffset(zoneOffset41);
                    }
                    ZoneOffset zoneOffset42 = madVar.d;
                    if (zoneOffset42 != null) {
                        builderB3.setEndZoneOffset(zoneOffset42);
                    }
                    builderB3.build().getClass();
                    return;
                }
                if (y7eVar instanceof mqe) {
                    mqe mqeVar = (mqe) y7eVar;
                    u8e.g();
                    RespiratoryRateRecord.Builder builderA3 = u8e.a(yrk.n(mqeVar.d), mqeVar.a, mqeVar.c);
                    ZoneOffset zoneOffset43 = mqeVar.b;
                    if (zoneOffset43 != null) {
                        builderA3.setZoneOffset(zoneOffset43);
                    }
                    builderA3.build().getClass();
                    return;
                }
                if (y7eVar instanceof cre) {
                    cre creVar = (cre) y7eVar;
                    u8e.j();
                    RestingHeartRateRecord.Builder builderB4 = u8e.b(yrk.n(creVar.d), creVar.a, creVar.c);
                    ZoneOffset zoneOffset44 = creVar.b;
                    if (zoneOffset44 != null) {
                        builderB4.setZoneOffset(zoneOffset44);
                    }
                    builderB4.build().getClass();
                    return;
                }
                if (y7eVar instanceof qzf) {
                    qzf qzfVar = (qzf) y7eVar;
                    t8e.p();
                    Metadata metadataN15 = yrk.n(qzfVar.c);
                    Instant instant24 = qzfVar.a;
                    Integer num17 = (Integer) r69.u.get(Integer.valueOf(qzfVar.d));
                    SexualActivityRecord.Builder builderF = t8e.f(metadataN15, instant24, num17 != null ? num17.intValue() : 0);
                    ZoneOffset zoneOffset45 = qzfVar.b;
                    if (zoneOffset45 != null) {
                        builderF.setZoneOffset(zoneOffset45);
                    }
                    builderF.build().getClass();
                    return;
                }
                if (y7eVar instanceof r9g) {
                    r9g r9gVar = (r9g) y7eVar;
                    r8e.s();
                    SleepSessionRecord.Builder builderC = r8e.c(yrk.n(r9gVar.e), r9gVar.a, r9gVar.c);
                    ZoneOffset zoneOffset46 = r9gVar.b;
                    if (zoneOffset46 != null) {
                        builderC.setStartZoneOffset(zoneOffset46);
                    }
                    ZoneOffset zoneOffset47 = r9gVar.d;
                    if (zoneOffset47 != null) {
                        builderC.setEndZoneOffset(zoneOffset47);
                    }
                    String str8 = r9gVar.g;
                    if (str8 != null) {
                        builderC.setNotes(str8);
                    }
                    String str9 = r9gVar.f;
                    if (str9 != null) {
                        builderC.setTitle(str9);
                    }
                    List<q9g> list7 = r9gVar.h;
                    ArrayList arrayList15 = new ArrayList(x44.y(list7, 10));
                    for (q9g q9gVar : list7) {
                        r8e.n();
                        Instant instant25 = q9gVar.a;
                        Instant instant26 = q9gVar.b;
                        Integer num18 = (Integer) r69.D.get(Integer.valueOf(q9gVar.c));
                        arrayList15.add(r8e.d(instant25, instant26, num18 != null ? num18.intValue() : 0));
                    }
                    builderC.setStages(arrayList15);
                    builderC.build().getClass();
                    return;
                }
                if (y7eVar instanceof dig) {
                    dig digVar = (dig) y7eVar;
                    Metadata metadataN16 = yrk.n(digVar.f);
                    Instant instant27 = digVar.a;
                    Instant instant28 = digVar.c;
                    List<cig> list8 = digVar.e;
                    ArrayList arrayList16 = new ArrayList(x44.y(list8, 10));
                    for (cig cigVar : list8) {
                        v8e.f();
                        Velocity velocityFromMetersPerSecond3 = Velocity.fromMetersPerSecond(cigVar.b.a());
                        velocityFromMetersPerSecond3.getClass();
                        arrayList16.add(u8e.c(velocityFromMetersPerSecond3, cigVar.a));
                    }
                    SpeedRecord.Builder builderE3 = v8e.e(metadataN16, instant27, instant28, arrayList16);
                    ZoneOffset zoneOffset48 = digVar.b;
                    if (zoneOffset48 != null) {
                        builderE3.setStartZoneOffset(zoneOffset48);
                    }
                    ZoneOffset zoneOffset49 = digVar.d;
                    if (zoneOffset49 != null) {
                        builderE3.setEndZoneOffset(zoneOffset49);
                    }
                    builderE3.build().getClass();
                    return;
                }
                if (!(y7eVar instanceof mng)) {
                    if (y7eVar instanceof ong) {
                        d((ong) y7eVar);
                        return;
                    }
                    if (y7eVar instanceof c3i) {
                        e((c3i) y7eVar);
                        return;
                    }
                    if (y7eVar instanceof r0j) {
                        f((r0j) y7eVar);
                        return;
                    }
                    if (y7eVar instanceof g9j) {
                        g((g9j) y7eVar);
                        return;
                    } else if (y7eVar instanceof u9j) {
                        h((u9j) y7eVar);
                        return;
                    } else {
                        xh6.k("Unsupported record ", y7eVar);
                        return;
                    }
                }
                mng mngVar = (mng) y7eVar;
                Metadata metadataN17 = yrk.n(mngVar.f);
                Instant instant29 = mngVar.a;
                Instant instant30 = mngVar.c;
                List<lng> list9 = mngVar.e;
                ArrayList arrayList17 = new ArrayList(x44.y(list9, 10));
                for (lng lngVar : list9) {
                    r8e.h();
                    arrayList17.add(r8e.f(lngVar.b, lngVar.a));
                }
                StepsCadenceRecord.Builder builderE4 = r8e.e(metadataN17, instant29, instant30, arrayList17);
                ZoneOffset zoneOffset50 = mngVar.b;
                if (zoneOffset50 != null) {
                    builderE4.setStartZoneOffset(zoneOffset50);
                }
                ZoneOffset zoneOffset51 = mngVar.d;
                if (zoneOffset51 != null) {
                    builderE4.setEndZoneOffset(zoneOffset51);
                }
                builderE4.build().getClass();
            }
        }
    }

    public static final StepsRecord d(ong ongVar) {
        t8e.r();
        StepsRecord.Builder builderG = t8e.g(yrk.n(ongVar.f), ongVar.a, ongVar.c, ongVar.e);
        ZoneOffset zoneOffset = ongVar.b;
        if (zoneOffset != null) {
            builderG.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = ongVar.d;
        if (zoneOffset2 != null) {
            builderG.setEndZoneOffset(zoneOffset2);
        }
        StepsRecord stepsRecordBuild = builderG.build();
        stepsRecordBuild.getClass();
        return stepsRecordBuild;
    }

    public static final TotalCaloriesBurnedRecord e(c3i c3iVar) {
        u8e.k();
        TotalCaloriesBurnedRecord.Builder builderD = u8e.d(yrk.n(c3iVar.f), c3iVar.a, c3iVar.c, ac1.l(c3iVar.e));
        ZoneOffset zoneOffset = c3iVar.b;
        if (zoneOffset != null) {
            builderD.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = c3iVar.d;
        if (zoneOffset2 != null) {
            builderD.setEndZoneOffset(zoneOffset2);
        }
        TotalCaloriesBurnedRecord totalCaloriesBurnedRecordBuild = builderD.build();
        totalCaloriesBurnedRecordBuild.getClass();
        return totalCaloriesBurnedRecordBuild;
    }

    public static final Vo2MaxRecord f(r0j r0jVar) {
        t8e.o();
        Metadata metadataN = yrk.n(r0jVar.c);
        Instant instant = r0jVar.a;
        Integer num = (Integer) r69.i.get(Integer.valueOf(r0jVar.e));
        Vo2MaxRecord.Builder builderH = t8e.h(metadataN, instant, num != null ? num.intValue() : 0, r0jVar.d);
        ZoneOffset zoneOffset = r0jVar.b;
        if (zoneOffset != null) {
            builderH.setZoneOffset(zoneOffset);
        }
        Vo2MaxRecord vo2MaxRecordBuild = builderH.build();
        vo2MaxRecordBuild.getClass();
        return vo2MaxRecordBuild;
    }

    public static final WeightRecord g(g9j g9jVar) {
        r8e.q();
        WeightRecord.Builder builderG = r8e.g(yrk.n(g9jVar.d), g9jVar.a, ac1.n(g9jVar.c));
        ZoneOffset zoneOffset = g9jVar.b;
        if (zoneOffset != null) {
            builderG.setZoneOffset(zoneOffset);
        }
        WeightRecord weightRecordBuild = builderG.build();
        weightRecordBuild.getClass();
        return weightRecordBuild;
    }

    public static final WheelchairPushesRecord h(u9j u9jVar) {
        t8e.n();
        WheelchairPushesRecord.Builder builderI = t8e.i(yrk.n(u9jVar.f), u9jVar.a, u9jVar.c, u9jVar.e);
        ZoneOffset zoneOffset = u9jVar.b;
        if (zoneOffset != null) {
            builderI.setStartZoneOffset(zoneOffset);
        }
        ZoneOffset zoneOffset2 = u9jVar.d;
        if (zoneOffset2 != null) {
            builderI.setEndZoneOffset(zoneOffset2);
        }
        WheelchairPushesRecord wheelchairPushesRecordBuild = builderI.build();
        wheelchairPushesRecordBuild.getClass();
        return wheelchairPushesRecordBuild;
    }

    public static final r9g i(SleepSessionRecord sleepSessionRecord) {
        Instant startTime = sleepSessionRecord.getStartTime();
        startTime.getClass();
        ZoneOffset startZoneOffset = sleepSessionRecord.getStartZoneOffset();
        Instant endTime = sleepSessionRecord.getEndTime();
        endTime.getClass();
        ZoneOffset endZoneOffset = sleepSessionRecord.getEndZoneOffset();
        Metadata metadata = sleepSessionRecord.getMetadata();
        metadata.getClass();
        ijb ijbVarO = yrk.o(metadata);
        CharSequence title = sleepSessionRecord.getTitle();
        String string = title != null ? title.toString() : null;
        CharSequence notes = sleepSessionRecord.getNotes();
        String string2 = notes != null ? notes.toString() : null;
        List stages = sleepSessionRecord.getStages();
        stages.getClass();
        List list = stages;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SleepSessionRecord.Stage stageJ = n8e.j(it.next());
            stageJ.getClass();
            Instant startTime2 = stageJ.getStartTime();
            startTime2.getClass();
            Instant endTime2 = stageJ.getEndTime();
            endTime2.getClass();
            Integer num = (Integer) r69.E.get(Integer.valueOf(stageJ.getType()));
            arrayList.add(new q9g(startTime2, endTime2, num != null ? num.intValue() : 0));
        }
        return new r9g(startTime, startZoneOffset, endTime, endZoneOffset, ijbVarO, string, string2, w44.i1(arrayList, new g67(28)));
    }

    public static final mng j(StepsCadenceRecord stepsCadenceRecord) {
        Instant startTime = stepsCadenceRecord.getStartTime();
        startTime.getClass();
        ZoneOffset startZoneOffset = stepsCadenceRecord.getStartZoneOffset();
        Instant endTime = stepsCadenceRecord.getEndTime();
        endTime.getClass();
        ZoneOffset endZoneOffset = stepsCadenceRecord.getEndZoneOffset();
        List samples = stepsCadenceRecord.getSamples();
        samples.getClass();
        List list = samples;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StepsCadenceRecord.StepsCadenceRecordSample stepsCadenceRecordSampleI = e8e.i(it.next());
            stepsCadenceRecordSampleI.getClass();
            Instant time = stepsCadenceRecordSampleI.getTime();
            time.getClass();
            arrayList.add(new lng(stepsCadenceRecordSampleI.getRate(), time));
        }
        List listI1 = w44.i1(arrayList, new x8e(0));
        Metadata metadata = stepsCadenceRecord.getMetadata();
        metadata.getClass();
        return new mng(startTime, startZoneOffset, endTime, endZoneOffset, listI1, yrk.o(metadata));
    }

    public static final c3i k(TotalCaloriesBurnedRecord totalCaloriesBurnedRecord) {
        Instant startTime = totalCaloriesBurnedRecord.getStartTime();
        startTime.getClass();
        ZoneOffset startZoneOffset = totalCaloriesBurnedRecord.getStartZoneOffset();
        Instant endTime = totalCaloriesBurnedRecord.getEndTime();
        endTime.getClass();
        ZoneOffset endZoneOffset = totalCaloriesBurnedRecord.getEndZoneOffset();
        Energy energy = totalCaloriesBurnedRecord.getEnergy();
        energy.getClass();
        yn6 yn6VarP = ac1.p(energy);
        Metadata metadata = totalCaloriesBurnedRecord.getMetadata();
        metadata.getClass();
        return new c3i(startTime, startZoneOffset, endTime, endZoneOffset, yn6VarP, yrk.o(metadata));
    }

    public static final r0j l(Vo2MaxRecord vo2MaxRecord) {
        Instant time = vo2MaxRecord.getTime();
        time.getClass();
        ZoneOffset zoneOffset = vo2MaxRecord.getZoneOffset();
        double vo2MillilitersPerMinuteKilogram = vo2MaxRecord.getVo2MillilitersPerMinuteKilogram();
        Integer num = (Integer) r69.j.get(Integer.valueOf(vo2MaxRecord.getMeasurementMethod()));
        int iIntValue = num != null ? num.intValue() : 0;
        Metadata metadata = vo2MaxRecord.getMetadata();
        metadata.getClass();
        return new r0j(time, zoneOffset, yrk.o(metadata), vo2MillilitersPerMinuteKilogram, iIntValue);
    }

    public static final g9j m(WeightRecord weightRecord) {
        Instant time = weightRecord.getTime();
        time.getClass();
        ZoneOffset zoneOffset = weightRecord.getZoneOffset();
        Mass weight = weightRecord.getWeight();
        weight.getClass();
        xua xuaVar = fva.G;
        fva fvaVarA = xua.a(weight.getInGrams());
        Metadata metadata = weightRecord.getMetadata();
        metadata.getClass();
        return new g9j(time, zoneOffset, fvaVarA, yrk.o(metadata));
    }

    public static final u9j n(WheelchairPushesRecord wheelchairPushesRecord) {
        Instant startTime = wheelchairPushesRecord.getStartTime();
        startTime.getClass();
        ZoneOffset startZoneOffset = wheelchairPushesRecord.getStartZoneOffset();
        Instant endTime = wheelchairPushesRecord.getEndTime();
        endTime.getClass();
        ZoneOffset endZoneOffset = wheelchairPushesRecord.getEndZoneOffset();
        long count = wheelchairPushesRecord.getCount();
        Metadata metadata = wheelchairPushesRecord.getMetadata();
        metadata.getClass();
        return new u9j(startTime, startZoneOffset, endTime, endZoneOffset, count, yrk.o(metadata));
    }
}
