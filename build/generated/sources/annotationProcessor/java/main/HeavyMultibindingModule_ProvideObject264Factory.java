import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject264Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject264Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject264(module);
  }

  public static HeavyMultibindingModule_ProvideObject264Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject264Factory(module);
  }

  public static Object provideObject264(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject264());
  }
}
